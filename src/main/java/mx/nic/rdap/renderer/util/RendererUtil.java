package mx.nic.rdap.renderer.util;

import java.util.List;

/**
 * Utility methods for the Renderer API
 */
public class RendererUtil {

	/**
	 * Indicates whether an object should be rendered in the response construct.
	 * 
	 * This is because the value to evaluate could be 'null', an empty value or
	 * empty list.
	 * 
	 * It is the duty of a renderer implementer to write or not to write with empty
	 * or null values the response.
	 * 
	 * @param objectValue
	 *            Value to be evaluated
	 * @return <code>true</code> if the value should be rendered, of
	 *         <code>false</code> if the value shouldn't be rendered.
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isObjectVisible(Object objectValue) {
		if (objectValue == null)
			return false;

		if (objectValue instanceof String) {
			if (((String) objectValue).isEmpty()) {
				return false;
			}
		} else if (objectValue instanceof List && ((List) objectValue).isEmpty()) {
			return false;
		}

		return true;
	}

}
