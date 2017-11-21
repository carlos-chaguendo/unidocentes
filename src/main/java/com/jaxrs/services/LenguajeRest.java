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

import com.ejb.services.LenguajeServices;
import com.jpa.entities.TblLenguaje;

@Path("/lenguaje")
public class LenguajeRest {

	@Inject
	private LenguajeServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblLenguaje lenguaje) {
		services.create(lenguaje);
		return Response.ok(lenguaje, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblLenguaje lenguaje) {
		services.edit(lenguaje);
		return Response.ok(lenguaje, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idlenguaje) {
		services.remove(services.find(idlenguaje));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblLenguaje find(@PathParam("id") long idlenguaje) {
		return services.find(idlenguaje);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblLenguaje> findAll() {
		return services.findAll();
	}
}
