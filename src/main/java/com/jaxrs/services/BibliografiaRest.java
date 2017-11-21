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

import com.ejb.services.BibliografiaServices;
import com.jpa.entities.TblBibliografia;


@Path("/bibliografia")
public class BibliografiaRest {


		@Inject
		private BibliografiaServices services;

		@POST
		@Path("/save")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response save(TblBibliografia bibliografia) {
			services.create(bibliografia);
			return Response.ok(bibliografia, MediaType.APPLICATION_JSON).build();
		}

		@POST
		@Path("/edit")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response edit(TblBibliografia bibliografia) {
			services.edit(bibliografia);
			return Response.ok(bibliografia, MediaType.APPLICATION_JSON).build();
		}

		@DELETE
		@Path("/remove/{id}")
		public Response remove(@PathParam("id") long idbibliografia) {
			services.remove(services.find(idbibliografia));
			return Response.noContent().build();
		}

		@GET
		@Path("/find/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public TblBibliografia find(@PathParam("id") long idasignatura) {
			return services.find(idasignatura);
		}

		@GET
		@Path("/findAll")
		@Produces(MediaType.APPLICATION_JSON)
		public List<TblBibliografia> findAll() {
			return services.findAll();
		}

}

