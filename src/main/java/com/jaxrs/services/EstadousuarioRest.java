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

import com.ejb.services.EstadoUsuarioServices;
import com.jpa.entities.TblEstadousuario;

@Path("/estadousuario")
public class EstadousuarioRest {

	@Inject
	private EstadoUsuarioServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblEstadousuario estadoUsuario) {
		services.create(estadoUsuario);
		return Response.ok(estadoUsuario, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblEstadousuario estadoUsuario) {
		services.edit(estadoUsuario);
		return Response.ok(estadoUsuario, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idestadousuario) {
		services.remove(services.find(idestadousuario));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblEstadousuario find(@PathParam("id") long idestadousuario) {
		return services.find(idestadousuario);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblEstadousuario> findAll() {
		return services.findAll();
	}
}
