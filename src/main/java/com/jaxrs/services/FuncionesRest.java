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

import com.ejb.services.FuncionesServices;
import com.jpa.entities.TblFuncione;

@Path("/funciones")
public class FuncionesRest {


	@Inject
	private FuncionesServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblFuncione funcion) {
		services.create(funcion);
		return Response.ok(funcion, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblFuncione funcion) {
		services.edit(funcion);
		return Response.ok(funcion, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idfuncion) {
		services.remove(services.find(idfuncion));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblFuncione find(@PathParam("id") long idfuncion) {
		return services.find(idfuncion);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblFuncione> findAll() {
		return services.findAll();
	}
}
