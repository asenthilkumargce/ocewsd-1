/**
 * @author ElsonJr
 *
 */
package com.ocewsd;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SIE - Service Interface Endpoint 
 *
 */

@WebService
public interface RandService {
	@WebMethod
	public int next1();

	@WebMethod
	public int[] nextN(final int n);

}
