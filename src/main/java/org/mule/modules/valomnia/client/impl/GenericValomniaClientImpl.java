/**
 *
 */
package org.mule.modules.valomnia.client.impl;

import java.io.BufferedReader;



import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.mule.modules.valomnia.client.*;
import org.mule.modules.valomnia.core.CustomNameValuePair;
import org.mule.util.BeanUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GenericValomniaClientImpl<T> extends AbstractValomniaClient
        implements GenericValomniaClient<T> {

    private final String token;

    private final String resourcePath;
    List<T> saved;

    static final Logger LOGGER = Logger.getLogger(GenericValomniaClient.class);

    /* Map of the request parameters */
    private Map<String, String> params;

    public GenericValomniaClientImpl(String baseUrl, String token, String resourcePath) {
        super(baseUrl);
        this.token = token;

        this.resourcePath = resourcePath;

    }

    public String getToken() {
        return this.token;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(final Map<String, String> params) {
        this.params = params;
    }

    @Override
    protected StringBuilder extendGetBaseUrl(final StringBuilder baseUrl) {

        return baseUrl.append(this.resourcePath);

    }

    @Override
    public ArrayList<T> getAll() {
    
        ArrayList<T> results = new ArrayList<T>();

        


        try {

            final List<CustomNameValuePair> parameters = new ArrayList<CustomNameValuePair>();

            parameters.add(new CustomNameValuePair("firstSynchronization",
                    "true"));

            parameters.add(new CustomNameValuePair("format", "json"));

            final String url = encodage(parameters);

            final HttpResponse response = this.getResponse("get",
                    this.getToken(), getBaseURL() + "list?" + url);
            results = this.processResponse(response);
            
            
                
                    

        
        }catch (Exception e) {

            e.printStackTrace();
        }

        return results;

    }

    /**
     * this method process the response from Valomnia API
     * 
     * @param response
     *            returned by the invocation
     * @return List of entities , null if not found, or an Exception if something bad happened
     * @throws Exception
     */

    public ArrayList<T> processResponse(final HttpResponse response)
            throws Exception

    {

        ArrayList<T> entities = null;
        final String line = readResponseFromClientResponse(response);

        if (response.getStatusLine()
                .getStatusCode() == 404) {

            throw new ValomniaAPIException("ressource not found");

        } else if (response.getStatusLine()
                .getStatusCode() >= 400) {

            throw new ValomniaAPIException(line);

        }
        final ArrayList<T> results = new ArrayList<T>();
        try {

            entities = new ArrayList<T>();
            if (line != null) {
                Map<String, Object> rootMapObject1 = parseFromJson(line,
                        Map.class);
                Type mapType = new TypeToken<ArrayList<T>>() {
                }.getType();

                String listCreated = parseToJson(rootMapObject1, "listCreated");

                entities = parseFromJson(listCreated, mapType);
                results.addAll(entities);
                String listUpdated = parseToJson(rootMapObject1, "listUpdated");
                entities = parseFromJson(listUpdated, mapType);
                results.addAll(entities);
            }

            else
                System.out.println(" HTTP  code : "
                        + response.getStatusLine()
                                .getStatusCode());

        }

        catch (Exception e) {

            e.printStackTrace();
        }
        return results;

    }

    @Override
    public String merge(final Object object) {
        String result = null;
        String line;
        int saved;

        try {

            final List<CustomNameValuePair> parameters = new ArrayList<CustomNameValuePair>();

            saved = this.getAll()
                    .size();

            @SuppressWarnings("unchecked")
            final Map<String, Object> map = BeanUtils.describe(object);

            for (final Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null)
                    parameters.add(new CustomNameValuePair(entry.getKey(),
                            (String) entry.getValue()));

            }

            final String params = encodage(parameters);

            final HttpResponse response = this.getResponse("post",
                    this.getToken(), getBaseURL() + "saveOrUpdate?" + params);

            if (response.getStatusLine()
                    .getStatusCode() == 200) {

                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity()
                        .getContent()));

                int saved1 = this.getAll()
                        .size();

                if ((line = rd.readLine()) != null) {
                    if (saved != saved1)
                        result = "Success created";
                    else
                        result = "Success Updated";
                }

            } else {

                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity()
                        .getContent()));
                if ((line = rd.readLine()) != null) {

                    @SuppressWarnings("unchecked")
                    ArrayList<Object> javaRootMapObject = new Gson().fromJson(line, ArrayList.class);

                    Type type = new TypeToken<List<String>>() {
                    }.getType();

                    String Temp = new Gson().toJson((ArrayList<Object>) (javaRootMapObject));
                    List<String> errors = new Gson().fromJson(Temp, type);
                    result = errors.get(0).toString()+ errors.get(1).toString();
                }

            }
        } catch (ClientProtocolException e) {

        }

        catch (IOException e) {

            e.printStackTrace();
        }

        return result;

    }

}
