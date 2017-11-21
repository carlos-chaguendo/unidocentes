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

import com.ejb.services.TemasMicroCurServices;
import com.jpa.entities.TblTemasmicrocur;

@Path("/temasMicro")
public class TemasMicroCurRest {


	@Inject
	private TemasMicroCurServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblTemasmicrocur temaMicro) {
		services.create(temaMicro);
		return Response.ok(temaMicro, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblTemasmicrocur temaMicro) {
		services.edit(temaMicro);
		return Response.ok(temaMicro, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idtemasmicrocur) {
		services.remove(services.find(idtemasmicrocur));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblTemasmicrocur find(@PathParam("id") long idtemasmicrocur) {
		return services.find(idtemasmicrocur);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblTemasmicrocur> findAll() {
		return services.findAll();
	}
}
