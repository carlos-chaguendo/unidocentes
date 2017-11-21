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

import com.ejb.services.UnidadMicroCurServices;
import com.jpa.entities.TblUnidadmicrocur;

@Path("/unidadMicrocur")
public class UnidadMicrocurRest {


	@Inject
	private UnidadMicroCurServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblUnidadmicrocur unidadMicro) {
		services.create(unidadMicro);
		return Response.ok(unidadMicro, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblUnidadmicrocur unidadMicro) {
		services.edit(unidadMicro);
		return Response.ok(unidadMicro, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idunidadmicrocurr) {
		services.remove(services.find(idunidadmicrocurr));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblUnidadmicrocur find(@PathParam("id") long idunidadmicrocurr) {
		return services.find(idunidadmicrocurr);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblUnidadmicrocur> findAll() {
		return services.findAll();
	}
}
