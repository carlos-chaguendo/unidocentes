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

import com.ejb.services.RolesServices;
import com.jpa.entities.TblRole;

@Path("/roles")
public class RolesRest {


	@Inject
	private RolesServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblRole roles) {
		services.create(roles);
		return Response.ok(roles, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblRole roles) {
		services.edit(roles);
		return Response.ok(roles, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idrol) {
		services.remove(services.find(idrol));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblRole find(@PathParam("id") long idrol) {
		return services.find(idrol);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblRole> findAll() {
		return services.findAll();
	}
}
