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

import com.ejb.services.EstadomicrocurrServices;
import com.jpa.entities.TblEstadomicrocurr;

@Path("/estadoMicro")
public class EstadomicrocurrRest {


	@Inject
	private EstadomicrocurrServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblEstadomicrocurr estadoMicro) {
		services.create(estadoMicro);
		return Response.ok(estadoMicro, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblEstadomicrocurr estadoMicro) {
		services.edit(estadoMicro);
		return Response.ok(estadoMicro, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idestadomicrocurr) {
		services.remove(services.find(idestadomicrocurr));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblEstadomicrocurr find(@PathParam("id") long idestadomicrocurr) {
		return services.find(idestadomicrocurr);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblEstadomicrocurr> findAll() {
		return services.findAll();
	}
}
