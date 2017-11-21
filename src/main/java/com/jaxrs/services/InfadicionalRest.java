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

import com.ejb.services.InfadicionalServices;
import com.jpa.entities.TblInfadicional;

@Path("/infAdicional")
public class InfadicionalRest {


	@Inject
	private InfadicionalServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblInfadicional infAdicional) {
		services.create(infAdicional);
		return Response.ok(infAdicional, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblInfadicional infAdicional) {
		services.edit(infAdicional);
		return Response.ok(infAdicional, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idinfadicional) {
		services.remove(services.find(idinfadicional));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblInfadicional find(@PathParam("id") long idinfadicional) {
		return services.find(idinfadicional);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblInfadicional> findAll() {
		return services.findAll();
	}
}
