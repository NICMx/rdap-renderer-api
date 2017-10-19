package mx.nic.rdap.renderer.object;

import java.util.List;

import mx.nic.rdap.core.db.RdapObject;

/**
 * Response for an RdapObject search
 *
 * @param <T> the type of element of the search
 */
public class SearchResponse<T extends RdapObject> extends RdapResponse {

	/**
	 * {@link List} of all objects of the search request
	 */
	private List<T> rdapObjects;
	
	/**
	 * @return All the RdapObjects that match with the search request
	 */
	public List<T> getRdapObjects() {
		return rdapObjects;
	}
	
	/**
	 * @param rdapObjects RdapObjects that match with the search request
	 */
	public void setRdapObjects(List<T> rdapObjects) {
		this.rdapObjects = rdapObjects;
	}
}
