package mx.nic.rdap.renderer.object;

import java.util.ArrayList;
import java.util.List;

public class ExceptionResponse extends RdapResponse {
	/**
	 * Message that describe this error response.
	 */
	private List<String> errorDescription;

	/**
	 * Error code number, corresponding to the HTTP response code
	 */
	private String errorCode;

	/**
	 * Title of this error response
	 */
	private String errorTitle;

	public ExceptionResponse(List<String> description, String errorCode, String errorTitle) {
		this.errorDescription = description;
		this.errorCode = errorCode;
		this.errorTitle = errorTitle;
	}

	public ExceptionResponse(String description, String errorCode, String errorTitle) {
		if (description != null && !description.trim().isEmpty()) {
			this.errorDescription = new ArrayList<>();
			this.errorDescription.add(description);
		}
		this.errorCode = errorCode;
		this.errorTitle = errorTitle;
	}

	/**
	 * @return {@link List} of {@link String}s that represents a message that
	 *         describe this error response
	 */
	public List<String> getDescription() {
		return errorDescription;
	}

	/**
	 * @return Error code number, corresponding to the HTTP response code
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return Title of this error response
	 */
	public String getErrorTitle() {
		return errorTitle;
	}

	/**
	 * @param description
	 *            {@link List} of {@link String}s that represents a message that
	 *            describe this error response
	 */
	public void setDescription(List<String> description) {
		this.errorDescription = description;
	}

	/**
	 * @param errorCode
	 *            Error code number, corresponding to the HTTP response code
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @param errorTitle
	 *            Title of this error response
	 */
	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}
}
