package mx.nic.rdap.renderer;

import java.io.PrintWriter;

import mx.nic.rdap.core.db.Autnum;
import mx.nic.rdap.core.db.Domain;
import mx.nic.rdap.core.db.Entity;
import mx.nic.rdap.core.db.IpNetwork;
import mx.nic.rdap.core.db.Nameserver;
import mx.nic.rdap.renderer.object.ExceptionResponse;
import mx.nic.rdap.renderer.object.HelpResponse;
import mx.nic.rdap.renderer.object.RequestResponse;
import mx.nic.rdap.renderer.object.SearchResponse;

/**
 * A response formatter. Transforms a <code>mx.nic.rdap.server.result.RdapResult</code> to something the user
 * can parse.
 */
public interface Renderer {

	/**
	 * Render an {@link Entity} response to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderEntity(RequestResponse<Entity> response, PrintWriter printWriter);

	/**
	 * Render a {@link Domain} response to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderDomain(RequestResponse<Domain> response, PrintWriter printWriter);

	/**
	 * Render an {@link Autnum} response to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderAutnum(RequestResponse<Autnum> response, PrintWriter printWriter);

	/**
	 * Render a {@link Nameserver} response to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderNameserver(RequestResponse<Nameserver> response, PrintWriter printWriter);

	/**
	 * Render an {@link IpNetwork} response to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderIpNetwork(RequestResponse<IpNetwork> response, PrintWriter printWriter);

	/**
	 * Render an {@link Entity} {@link SearchResponse} to the specified
	 * {@link PrintWriter} <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderEntities(SearchResponse<Entity> response, PrintWriter printWriter);

	/**
	 * Render a {@link Domain} {@link SearchResponse} to the specified
	 * {@link PrintWriter} <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderNameservers(SearchResponse<Nameserver> response, PrintWriter printWriter);

	/**
	 * Render a {@link Nameserver} {@link SearchResponse} to the specified
	 * {@link PrintWriter} <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderDomains(SearchResponse<Domain> response, PrintWriter printWriter);

	/**
	 * Render an {@link ExceptionResponse} to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderException(ExceptionResponse response, PrintWriter printWriter);

	/**
	 * Render {@link HelpResponse} to the specified {@link PrintWriter}
	 * <code>printWriter</code>
	 * 
	 * @param response
	 *            Response that contains the object to render in the
	 *            <code>PrintWriter</code>
	 * @param printWriter
	 *            <code>PrintWriter</code> to use for output
	 */
	public void renderHelp(HelpResponse response, PrintWriter printWriter);

}
