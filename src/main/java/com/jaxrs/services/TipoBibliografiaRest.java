package com.jaxrs.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ejb.services.TipoBibliografiaServices;
import com.jpa.entities.TblTipobibliografia;

@Path("/tipoBibliografia")
public class TipoBibliografiaRest {


	@Inject
	private TipoBibliografiaServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblTipobibliografia tipoBiblio) {
		services.create(tipoBiblio);
		return Response.ok(tipoBiblio, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblTipobibliografia tipoBiblio) {
		services.edit(tipoBiblio);
		return Response.ok(tipoBiblio, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idtipobibliografia) {
		services.remove(services.find(idtipobibliografia));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblTipobibliografia find(@PathParam("id") long idtipobibliografia) {
		return services.find(idtipobibliografia);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblTipobibliografia> findAll() {
		return services.findAll();
	}
}
