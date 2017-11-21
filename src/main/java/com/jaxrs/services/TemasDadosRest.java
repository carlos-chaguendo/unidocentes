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

import com.ejb.services.TemasDadosServices;
import com.jpa.entities.TblTemasdado;

@Path("/temasDados")
public class TemasDadosRest {


	@Inject
	private TemasDadosServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblTemasdado temasDados) {
		services.create(temasDados);
		return Response.ok(temasDados, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblTemasdado temasDados) {
		services.edit(temasDados);
		return Response.ok(temasDados, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idtemasdados) {
		services.remove(services.find(idtemasdados));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblTemasdado find(@PathParam("id") long idtemasdados) {
		return services.find(idtemasdados);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblTemasdado> findAll() {
		return services.findAll();
	}
}
