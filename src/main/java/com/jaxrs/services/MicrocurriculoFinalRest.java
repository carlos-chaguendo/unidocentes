package com.jaxrs.services;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.transaction.UserTransaction;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ejb.gui.entities.MicrocurriculoFinal;
import com.ejb.services.AsignaturaServices;
import com.ejb.services.BibliografiaServices;
import com.ejb.services.DocentesServices;
import com.ejb.services.EstadomicrocurrServices;
import com.ejb.services.LenguajeServices;
import com.ejb.services.MicrocurriculoServices;
import com.ejb.services.TipoBibliografiaServices;
import com.ejb.services.TipoCursoServices;
import com.ejb.services.UnidadMicroCurServices;
import com.jpa.entities.TblAsignatura;
import com.jpa.entities.TblBibliografia;
import com.jpa.entities.TblDocente;
import com.jpa.entities.TblEstadomicrocurr;
import com.jpa.entities.TblLenguaje;
import com.jpa.entities.TblMicrocurriculo;
import com.jpa.entities.TblTipobibliografia;
import com.jpa.entities.TblTipocurso;
import com.jpa.entities.TblUnidadmicrocur;




@Path("/microcurriculoFinal")
public class MicrocurriculoFinalRest {

	@Inject
	private AsignaturaServices asignaturaServices;
	@Inject
	private TipoCursoServices tipocursoServices;
	@Inject
	private MicrocurriculoServices microcurriculoServices;
	@Inject
	private UnidadMicroCurServices unidadmicrocurrServices;
	@Inject
	private BibliografiaServices bibliografiaServices;
	@Inject
	private TipoBibliografiaServices tipobibliografiaServices;
	@Inject
	private DocentesServices docentesServices;
	@Inject
	private EstadomicrocurrServices estadomicroServices;
	@Inject
	private LenguajeServices lenguajeServices;


	@Resource
	private UserTransaction transaction;


	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(MicrocurriculoFinal microFinal) {
		// Obtener los objetos correspondientes
		TblAsignatura asignatura = microFinal.getAsignatura();
		TblTipocurso tipoCurso = microFinal.getTipoCurso();
		TblMicrocurriculo microcurr = microFinal.getMicrocurr();
		TblUnidadmicrocur unimicrocurr= microFinal.getUnimicrocurr();
		TblBibliografia bibliografia= microFinal.getBibliografia();
		TblTipobibliografia tipoBibliografia= microFinal.getTipoBibliografia();
		TblDocente docente= microFinal.getDocente();
		TblEstadomicrocurr estadomicro=microFinal.getEstadomicro();
		TblLenguaje lengua= microFinal.getLenguaje();


		try {
			// Iniciar el hilo de la transacción a la BD
			transaction.begin();
			// Crear los tipos y estados
			tipobibliografiaServices.create(tipoBibliografia);
			tipocursoServices.create(tipoCurso);
			estadomicroServices.create(estadomicro);
			lenguajeServices.create(lengua);
			//Creo el docente
			docentesServices.create(docente);
			// Establecer el tipo y el docente a la asignatura
			asignatura.setTblTipocurso(tipoCurso);
			asignatura.setTblDocente(docente);
			// Crear la asignatura
			asignaturaServices.create(asignatura);
			// establecer el estado y la asignatura a microcurriculo
			microcurr.setTblEstadomicrocurr(estadomicro);
			microcurr.setTblAsignatura(asignatura);
			//creo microcurriculo
			microcurriculoServices.create(microcurr);
			//Establezco el microcurriculo para la unidad
			unimicrocurr.setTblMicrocurriculo(microcurr);
			//Creo unidad microcurriculo
			unidadmicrocurrServices.create(unimicrocurr);
			//establezco lenguaje y tipo a bibliografia y mirocurriculo a bibliografia
			bibliografia.setTblLenguaje(lengua);
			bibliografia.setTblTipobibliografia(tipoBibliografia);
			bibliografia.setTblMicrocurriculo(microcurr);
			//creo bibliografia
			bibliografiaServices.create(bibliografia);


			// Cerrar el hilo de la transacción a la BD
			transaction.commit();
		} catch (Exception ex) {
			System.err.println("ERROR: " + ex.getMessage());
			try {
				transaction.rollback();
			} catch (Exception ex2) {
				System.err.println("ERROR: " + ex2.getMessage());
			}
		}
		return Response.ok(microFinal, MediaType.APPLICATION_JSON).build();
	}

//	@DELETE
//	@Path("{idA}/{idTC}/{idTB}/{idM}/{idU}/{idB}/{idD}/{idE}/{idL}")
//	public Response remove(@PathParam("idA") long idasignaturas, @PathParam("idTC") long idtipocurso,
//			@PathParam("idTB") long idtipobibliografia, @PathParam("idM") long idmicrocur, @PathParam("idU") long idunidadmicrocurr,
//			@PathParam("idB") long idbibliografia, @PathParam("idD") long iddocente, @PathParam("idE") long idestadomicrocurr,
//			@PathParam("idL") long idlenguaje) {
//		TblAsignatura asignatura = asignaturaServices.find(idasignaturas);
//		TblTipocurso tipocurso = tipocursoServices.find(idtipocurso);
//		TblTipobibliografia tipobibliografia = tipobibliografiaServices.find(idtipobibliografia);
//		TblMicrocurriculo microcurriculo = microcurriculoServices.find(idmicrocur);
//		TblUnidadmicrocur unidadmicrocur = unidadmicrocurrServices.find(idunidadmicrocurr);
//		TblBibliografia bibliografia = bibliografiaServices.find(idbibliografia);
//		TblDocente docente = docentesServices.find(iddocente);
//		TblEstadomicrocurr estadomicro = estadomicroServices.find(idestadomicrocurr);
//		TblLenguaje lenguaje = lenguajeServices.find(idlenguaje);
//		//List<DocenteCurso> docentesCursos = docenteCursoServices.findAll();
//		try {
//			transaction.begin();
//			asignaturaServices.remove();
	//cursoServices.remove(curso);
//			docenteServices.remove(docente);
//			programaServices.remove(programa);
//			transaction.commit();
//		} catch (Exception ex) {
//			System.err.println("ERROR: " + ex.getMessage());
//			try {
//				transaction.rollback();
//			} catch (Exception ex2) {
//				System.err.println("ERROR: " + ex2.getMessage());
//			}
//		}
//		return Response.noContent().build();
//	}
//
//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response update(MicrocurriculoFinal universidad) {
//		// Obtener los objetos correspondientes
//		Programa programa = universidad.getPrograma();
//		Docente docente = universidad.getDocente();
//		Curso curso = universidad.getCurso();
//		try {
//			// Iniciar el hilo de la transacción a la BD
//			transaction.begin();
//			// Editar el programa
//			programaServices.edit(programa);
//			// Editar el docente
//			docenteServices.edit(docente);
//			// Editar el curso
//			cursoServices.edit(curso);
//			// Cerrar el hilo de la transacción a la BD
//			transaction.commit();
//		} catch (Exception ex) {
//			System.err.println("ERROR: " + ex.getMessage());
//			try {
//				transaction.rollback();
//			} catch (Exception ex2) {
//				System.err.println("ERROR: " + ex2.getMessage());
//			}
//		}
//		return Response.ok(universidad, MediaType.APPLICATION_JSON).build();
//	}
//
//	@GET
//	@Path("{idP}/{idD}/{idC}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public MicrocurriculoFinal find(@PathParam("idP") long idPrograma, @PathParam("idD") long idDocente,
//			@PathParam("idC") long idCurso) {
//		Programa programa = programaServices.find(idPrograma);
//		Docente docente = docenteServices.find(idDocente);
//		Curso curso = cursoServices.find(idCurso);
//		MicrocurriculoFinal universidad = new MicrocurriculoFinal(programa, docente, curso);
//		return universidad;
//	}
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<MicrocurriculoFinal> findAll() {
//		// Lista de objetos de tipo Universidad para devolver a la GUI.
//		List<MicrocurriculoFinal> universidades = new ArrayList<MicrocurriculoFinal>();
//		// Obtener la lista de docente-curso
//		List<DocenteCurso> docentesCursos = docenteCursoServices.findAll();
//		// Obtener los docentes, sus cursos asociados y el programa al que
//		// pertenecen.
//		for (DocenteCurso dc : docentesCursos) {
//			Docente docente = dc.getDocente();
//			Curso curso = dc.getCurso();
//			Programa programa = docente.getPrograma();
//			// Con esta información crear objetos de tipo Universidad y
//			// adicionarlos a la lista.
//			MicrocurriculoFinal universidad = new MicrocurriculoFinal(programa, docente, curso);
//			universidades.add(universidad);
//		}
//		return universidades;
//	}
}
