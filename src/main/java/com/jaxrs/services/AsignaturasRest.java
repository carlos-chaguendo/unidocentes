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

import com.ejb.services.AsignaturaServices;
import com.jpa.entities.TblAsignatura;

@Path("/asignatura")
public class AsignaturasRest {





		@Inject
		private AsignaturaServices services;

		@POST
		@Path("/save")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response save(TblAsignatura asignatura) {
			services.create(asignatura);
			return Response.ok(asignatura, MediaType.APPLICATION_JSON).build();
		}

		@POST
		@Path("/edit")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response edit(TblAsignatura asignatura) {
			services.edit(asignatura);
			return Response.ok(asignatura, MediaType.APPLICATION_JSON).build();
		}

		@DELETE
		@Path("/remove/{id}")
		public Response remove(@PathParam("id") long idasignatura) {
			services.remove(services.find(idasignatura));
			return Response.noContent().build();
		}

		@GET
		@Path("/find/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public TblAsignatura find(@PathParam("id") long idasignatura) {
			return services.find(idasignatura);
		}

		@GET
		@Path("/findAll")
		@Produces(MediaType.APPLICATION_JSON)
		public List<TblAsignatura> findAll() {
			return services.findAll();
		}
	}

