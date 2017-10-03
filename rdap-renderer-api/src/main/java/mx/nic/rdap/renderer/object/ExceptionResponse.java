package mx.nic.rdap.renderer.object;

import java.util.ArrayList;
import java.util.List;

public class ExceptionResponse extends RdapResponse {
	private List<String> errorDescription;
	private String errorCode;
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

	public List<String> getDescription() {
		return errorDescription;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorTitle() {
		return errorTitle;
	}

	public void setDescription(List<String> description) {
		this.errorDescription = description;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}
}
