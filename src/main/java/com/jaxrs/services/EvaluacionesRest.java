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

import com.ejb.services.EvaluacionesServices;
import com.jpa.entities.TblEvaluacione;

@Path("/evaluacion")
public class EvaluacionesRest {


	@Inject
	private EvaluacionesServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblEvaluacione evaluacion) {
		services.create(evaluacion);
		return Response.ok(evaluacion, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblEvaluacione evaluacion) {
		services.edit(evaluacion);
		return Response.ok(evaluacion, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idevaluacion) {
		services.remove(services.find(idevaluacion));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblEvaluacione find(@PathParam("id") long idevaluacion) {
		return services.find(idevaluacion);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblEvaluacione> findAll() {
		return services.findAll();
	}
}
