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

import com.ejb.services.PlaneadoresServices;
import com.jpa.entities.TblPlaneadore;

@Path("/planeadores")
public class PLaneadoresRest {


	@Inject
	private PlaneadoresServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblPlaneadore planeador) {
		services.create(planeador);
		return Response.ok(planeador, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblPlaneadore planeador) {
		services.edit(planeador);
		return Response.ok(planeador, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idplaneador) {
		services.remove(services.find(idplaneador));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblPlaneadore find(@PathParam("id") long idplaneador) {
		return services.find(idplaneador);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblPlaneadore> findAll() {
		return services.findAll();
	}
}
