package com.jpa.gui.entities;

import com.jpa.entities.TblAsignatura;
import com.jpa.entities.TblMicrocurriculo;
import com.jpa.entities.TblTipocurso;

public class Microcurriculo {

	private TblAsignatura asignatura;
	private TblTipocurso tipocurso;
	private TblMicrocurriculo microcurriculo;
	public TblAsignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(TblAsignatura asignatura) {
		this.asignatura = asignatura;
	}
	public TblTipocurso getTipocurso() {
		return tipocurso;
	}
	public void setTipocurso(TblTipocurso tipocurso) {
		this.tipocurso = tipocurso;
	}
	public TblMicrocurriculo getMicrocurriculo() {
		return microcurriculo;
	}
	public void setMicrocurriculo(TblMicrocurriculo microcurriculo) {
		this.microcurriculo = microcurriculo;
	}


}
