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

import com.ejb.services.BitacorasServices;
import com.jpa.entities.TblBitacora;

@Path("/bitacora")
public class BitacorasRest {


	@Inject
	private BitacorasServices services;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(TblBitacora bitacora) {
		services.create(bitacora);
		return Response.ok(bitacora, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(TblBitacora bitacora) {
		services.edit(bitacora);
		return Response.ok(bitacora, MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/remove/{id}")
	public Response remove(@PathParam("id") long idbitacora) {
		services.remove(services.find(idbitacora));
		return Response.noContent().build();
	}

	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TblBitacora find(@PathParam("id") long idbitacora) {
		return services.find(idbitacora);
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TblBitacora> findAll() {
		return services.findAll();
	}
}
