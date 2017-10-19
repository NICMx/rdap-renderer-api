package mx.nic.rdap.renderer.object;

import mx.nic.rdap.core.db.RdapObject;

/**
 * Response for a request to a specific object.
 *
 * @param <T> the type of element of the request.
 */
public class RequestResponse<T extends RdapObject> extends RdapResponse {

	/**
	 * Rdap object result of the request.
	 */
	private T rdapObject;

	/**
	 * @return the result RdapObject of the request
	 */
	public T getRdapObject() {
		return rdapObject;
	}

	/**
	 * @param rdapObject the RdapObject of the request
	 */
	public void setRdapObject(T rdapObject) {
		this.rdapObject = rdapObject;
	}

}
