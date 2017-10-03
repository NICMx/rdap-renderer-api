package mx.nic.rdap.renderer.object;

import java.util.List;

import mx.nic.rdap.core.db.Remark;

/**
 * An Abstract response for every response in the RDAP server.
 */
public abstract class RdapResponse {

	/**
	 * List that contains all the RDAP conformance strings.
	 */
	private List<String> rdapConformance;

	/**
	 * List of the information about the service providing RDAP information and/or information
	 * about the entire response
	 */
	private List<Remark> notices;

	/**
	 * @return The RDAP conformance {@link List} of the response
	 */
	public List<String> getRdapConformance() {
		return rdapConformance;
	}

	/**
	 * @param rdapConformance Set the RDAP conformance of the response.
	 */
	public void setRdapConformance(List<String> rdapConformance) {
		this.rdapConformance = rdapConformance;
	}

	/**
	 * @return Returns the notices of the response.
	 */
	public List<Remark> getNotices() {
		return notices;
	}

	/**
	 * @param notices Set the notices of the response.
	 */
	public void setNotices(List<Remark> notices) {
		this.notices = notices;
	}

}
