/**
 *
 */
package org.mule.modules.valomnia.client;

import java.util.ArrayList;



public interface GenericValomniaClient<T> {

	/**
	 * Get all the elements
	 * 
	 * @return List of all the elements
	 * @throws Exception
	 */

	ArrayList<T> getAll();

	/**
	 * save Or update the given element on Valomnia for the connected account
	 * 
	 * @param object
	 *            to be merged
	 * @return the created element
	 */

	String merge(Object object);

}
