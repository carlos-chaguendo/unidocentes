package com.ejb.gui.entities;

import com.jpa.entities.TblAsignatura;
import com.jpa.entities.TblBibliografia;
import com.jpa.entities.TblDocente;
import com.jpa.entities.TblEstadomicrocurr;
import com.jpa.entities.TblLenguaje;
import com.jpa.entities.TblMicrocurriculo;
import com.jpa.entities.TblTipobibliografia;
import com.jpa.entities.TblTipocurso;
import com.jpa.entities.TblUnidadmicrocur;

public class MicrocurriculoFinal {

	private TblAsignatura asignatura;
	private TblTipocurso tipoCurso;
	private TblMicrocurriculo microcurr;
	private TblUnidadmicrocur unimicrocurr;
	private TblBibliografia bibliografia;
	private TblTipobibliografia tipoBibliografia;
	private TblDocente docente;
	private TblEstadomicrocurr estadomicro;
	private TblLenguaje lenguaje;

	public MicrocurriculoFinal() {
	}

	public MicrocurriculoFinal(TblAsignatura asignatura, TblTipocurso tipoCurso, TblMicrocurriculo microcurr,
			TblUnidadmicrocur unimicrocurr, TblBibliografia bibliografia, TblTipobibliografia tipoBibliografia,
			TblDocente docente, TblEstadomicrocurr estadomicro, TblLenguaje lenguaje) {

		this.asignatura = asignatura;
		this.tipoCurso = tipoCurso;
		this.microcurr = microcurr;
		this.unimicrocurr = unimicrocurr;
		this.bibliografia = bibliografia;
		this.tipoBibliografia = tipoBibliografia;
		this.docente = docente;
		this.estadomicro = estadomicro;
		this.lenguaje = lenguaje;
	}

	public TblLenguaje getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(TblLenguaje lenguaje) {
		this.lenguaje = lenguaje;
	}

	public TblEstadomicrocurr getEstadomicro() {
		return estadomicro;
	}

	public void setEstadomicro(TblEstadomicrocurr estadomicro) {
		this.estadomicro = estadomicro;
	}

	public TblDocente getDocente() {
		return docente;
	}

	public void setDocente(TblDocente docente) {
		this.docente = docente;
	}

	public TblAsignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(TblAsignatura asignatura) {
		this.asignatura = asignatura;
	}

	public TblTipocurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TblTipocurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public TblMicrocurriculo getMicrocurr() {
		return microcurr;
	}

	public void setMicrocurr(TblMicrocurriculo microcurr) {
		this.microcurr = microcurr;
	}

	public TblUnidadmicrocur getUnimicrocurr() {
		return unimicrocurr;
	}

	public void setUnimicrocurr(TblUnidadmicrocur unimicrocurr) {
		this.unimicrocurr = unimicrocurr;
	}

	public TblBibliografia getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(TblBibliografia bibliografia) {
		this.bibliografia = bibliografia;
	}

	public TblTipobibliografia getTipoBibliografia() {
		return tipoBibliografia;
	}

	public void setTipoBibliografia(TblTipobibliografia tipoBibliografia) {
		this.tipoBibliografia = tipoBibliografia;
	}

}
