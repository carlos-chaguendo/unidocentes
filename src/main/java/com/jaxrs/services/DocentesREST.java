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

import com.ejb.services.DocentesServices;
import com.jpa.entities.TblDocente;

@Path("/docente")
public class DocentesREST {


	@Inject
	private DocentesServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblDocente docente) {
		services.create(docente);
		return Response.ok(docente, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblDocente docente) {
		services.edit(docente);
		return Response.ok(docente, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long iddocente) {
		services.remove(services.find(iddocente));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblDocente find(@PathParam("id") long iddocente) {
		return services.find(iddocente);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblDocente> findAll() {
		return services.findAll();
	}
}
