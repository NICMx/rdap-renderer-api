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
 * A response formatter. Transforms a {@link RdapResult} to something the user
 * can parse.
 */
public interface Renderer {

	public void renderEntity(RequestResponse<Entity> response, PrintWriter printWriter);

	public void renderDomain(RequestResponse<Domain> response, PrintWriter printWriter);

	public void renderAutnum(RequestResponse<Autnum> response, PrintWriter printWriter);

	public void renderNameserver(RequestResponse<Nameserver> response, PrintWriter printWriter);

	public void renderIpNetwork(RequestResponse<IpNetwork> response, PrintWriter printWriter);

	public void renderEntities(SearchResponse<Entity> response, PrintWriter printWriter);

	public void renderNameservers(SearchResponse<Nameserver> response, PrintWriter printWriter);

	public void renderDomains(SearchResponse<Domain> response, PrintWriter printWriter);

	public void renderException(ExceptionResponse response, PrintWriter printWriter);

	public void renderHelp(HelpResponse response, PrintWriter printWriter);

}
