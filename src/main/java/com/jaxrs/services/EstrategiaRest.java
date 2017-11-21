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

import com.ejb.services.EstrategiaServices;
import com.jpa.entities.TblEstrategia;

@Path("/estrategia")
public class EstrategiaRest {


	@Inject
	private EstrategiaServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblEstrategia estrategia) {
		services.create(estrategia);
		return Response.ok(estrategia, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblEstrategia estrategia) {
		services.edit(estrategia);
		return Response.ok(estrategia, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idestrategia) {
		services.remove(services.find(idestrategia));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblEstrategia find(@PathParam("id") long idestrategia) {
		return services.find(idestrategia);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblEstrategia> findAll() {
		return services.findAll();
	}
}
