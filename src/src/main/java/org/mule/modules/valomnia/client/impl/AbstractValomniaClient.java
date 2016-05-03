/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
/**
 *
 */
package org.mule.modules.valomnia.client.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.mule.modules.valomnia.core.CustomNameValuePair;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

/**
 * Base class for client service . The class handles:
 * 
 * base URL creation creation of the Http(Post/Get) read response from input
 * HttpResponse string Json-formated parsing to object Java Map parsing to
 * String Json-formated
 * 
 */

public abstract class AbstractValomniaClient {

	public AbstractValomniaClient(String baseUrl) {
		super();
		this.baseUrl = baseUrl;
	}

	private  String baseUrl;
	private static String encodage = "ISO-8859-1";
	protected Gson gson = null;
	private DefaultHttpClient client;

	/**
	 * @return the base URL for the service, inclduing what is added by {
	 *         AbstractValomniaClient#extendGetBaseUrl(StringBuilder)}
	 */

	protected String getBaseURL() {

		return this.extendGetBaseUrl(new StringBuilder(this.baseUrl))
				.toString();
	}

	/**
	 * This method is called by getBaseURL for the user to extend the base URL
	 *
	 * 
	 * @param baseUrl
	 *            a String builder with the Base Url
	 * @return the builder, with the extended content as needed
	 */

	protected abstract StringBuilder extendGetBaseUrl(
			final StringBuilder baseUrl);

	protected String readResponseFromClientResponse(final HttpResponse response) {

		String line = null;
		try {
			final BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));
			line = rd.readLine();
			if (line != null) {
				line = new String(line.getBytes("UTF-8"), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		catch (final IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static String encodage(final List<CustomNameValuePair> parameters) {
		return URLEncodedUtils.format(parameters, encodage);
	}

	/**
	 * Creates and execute a Http request
	 * 
	 * @param type
	 *            of Http request(Get or Post)
	 * @param token
	 *            for authentication
	 * @param url
	 *            the URL to be hit by the client
	 * @throws IOException
	 *             when error happened in method execute
	 * @return HttpRespnse.
	 * 
	 */

	protected HttpResponse getResponse(final String type, final String token,
			final String url) throws IOException

	{
		HttpResponse response = null;
		if (type.equals("get")) {
			client = new DefaultHttpClient();
			final HttpGet get = new HttpGet(url);
			get.setHeader("Cookie", "JSESSIONID=" + token);
			response = client.execute(get);
		} else {

			client = new DefaultHttpClient();
			final HttpPost post = new HttpPost(url);

			post.setHeader("Content-type", "application/json;charset=UTF-8");

			if (token != null) {
				post.setHeader("Cookie", "JSESSIONID=" + token);
				response = client.execute(post);
			}
		}
		return response;

	}

	/**
	 * Parse JSON to specified type
	 *
	 * @param <V>
	 *            type of the object to obtain
	 * @param type
	 *            of the object to obtain
	 * @param string
	 *            JSON-formatted string to parse
	 * @return parsed object
	 * @throws IOException
	 *             if the string is not JSON-formatted
	 */

	protected <V> V parseFromJson(final String string, final Type type)
			throws IOException {

		try {
			gson = new Gson();
			return gson.fromJson(string, type);
		} catch (final JsonParseException jpe) {
			final IOException ioe = new IOException(
					"Parse exception  JSON to object");
			throw ioe;
		}

	}

	/**
	 * Parse JAVA Map to String Json-formated
	 *
	 * @param Map
	 *            to parse
	 * @param name
	 *            for specify the map name
	 * @return String JSON-formated
	 * @throws IOException
	 *             if something happened in parsing
	 */

	protected String parseToJson(final Map<String, Object> map,
			final String name) throws IOException

	{
		try {

			gson = new Gson();
			@SuppressWarnings("unchecked")
			final ArrayList<Object> arrayList = (ArrayList<Object>) ((Map<String, Object>) map)
					.get(name);

			return gson.toJson(arrayList);
		} catch (final JsonParseException jpe) {
			final IOException ioe = new IOException(
					"Parse exception converting Object to Json");

			throw ioe;
		}
	}

	
	

	public  void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

}
