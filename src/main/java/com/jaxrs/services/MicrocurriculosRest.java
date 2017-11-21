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

import com.ejb.services.MicrocurriculoServices;
import com.jpa.entities.TblMicrocurriculo;

@Path("/microcurriculo")
public class MicrocurriculosRest {


	@Inject
	private MicrocurriculoServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblMicrocurriculo microcurr) {
		services.create(microcurr);
		return Response.ok(microcurr, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblMicrocurriculo microcurr) {
		services.edit(microcurr);
		return Response.ok(microcurr, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idmicocurr) {
		services.remove(services.find(idmicocurr));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblMicrocurriculo find(@PathParam("id") long idmicocurr) {
		return services.find(idmicocurr);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblMicrocurriculo> findAll() {
		return services.findAll();
	}
}
