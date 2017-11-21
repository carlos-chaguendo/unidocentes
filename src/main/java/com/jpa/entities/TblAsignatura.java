package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_ASIGNATURAS database table.
 * 
 */
@Entity
@Table(name="TBL_ASIGNATURAS")
@NamedQuery(name="TblAsignatura.findAll", query="SELECT t FROM TblAsignatura t")
public class TblAsignatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ASIGNATURAS_IDASIGNATURA_GENERATOR", sequenceName="SQ_ASIGNATURAS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_ASIGNATURAS_IDASIGNATURA_GENERATOR")
	private long idasignatura;

	private BigDecimal creditos;

	private BigDecimal horasacompanamiento;

	private BigDecimal horastrabajoindividual;

	private String nombreasignatura;

	private BigDecimal semestre;

	//bi-directional many-to-one association to TblDocente
	@ManyToOne
	@JoinColumn(name="IDDOCENTE")
	private TblDocente tblDocente;

	//bi-directional many-to-one association to TblTipocurso
	@ManyToOne
	@JoinColumn(name="IDTIPOCURSO")
	private TblTipocurso tblTipocurso;

	//bi-directional many-to-one association to TblMicrocurriculo
	@OneToMany(mappedBy="tblAsignatura")
	private List<TblMicrocurriculo> tblMicrocurriculos;

	//bi-directional many-to-one association to TblPlaneadore
	@OneToMany(mappedBy="tblAsignatura")
	private List<TblPlaneadore> tblPlaneadores;

	public TblAsignatura() {
	}

	public long getIdasignatura() {
		return this.idasignatura;
	}

	public void setIdasignatura(long idasignatura) {
		this.idasignatura = idasignatura;
	}

	public BigDecimal getCreditos() {
		return this.creditos;
	}

	public void setCreditos(BigDecimal creditos) {
		this.creditos = creditos;
	}

	public BigDecimal getHorasacompanamiento() {
		return this.horasacompanamiento;
	}

	public void setHorasacompanamiento(BigDecimal horasacompanamiento) {
		this.horasacompanamiento = horasacompanamiento;
	}

	public BigDecimal getHorastrabajoindividual() {
		return this.horastrabajoindividual;
	}

	public void setHorastrabajoindividual(BigDecimal horastrabajoindividual) {
		this.horastrabajoindividual = horastrabajoindividual;
	}

	public String getNombreasignatura() {
		return this.nombreasignatura;
	}

	public void setNombreasignatura(String nombreasignatura) {
		this.nombreasignatura = nombreasignatura;
	}

	public BigDecimal getSemestre() {
		return this.semestre;
	}

	public void setSemestre(BigDecimal semestre) {
		this.semestre = semestre;
	}

	public TblDocente getTblDocente() {
		return this.tblDocente;
	}

	public void setTblDocente(TblDocente tblDocente) {
		this.tblDocente = tblDocente;
	}

	public TblTipocurso getTblTipocurso() {
		return this.tblTipocurso;
	}

	public void setTblTipocurso(TblTipocurso tblTipocurso) {
		this.tblTipocurso = tblTipocurso;
	}

	public List<TblMicrocurriculo> getTblMicrocurriculos() {
		return this.tblMicrocurriculos;
	}

	public void setTblMicrocurriculos(List<TblMicrocurriculo> tblMicrocurriculos) {
		this.tblMicrocurriculos = tblMicrocurriculos;
	}

	public TblMicrocurriculo addTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		getTblMicrocurriculos().add(tblMicrocurriculo);
		tblMicrocurriculo.setTblAsignatura(this);

		return tblMicrocurriculo;
	}

	public TblMicrocurriculo removeTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		getTblMicrocurriculos().remove(tblMicrocurriculo);
		tblMicrocurriculo.setTblAsignatura(null);

		return tblMicrocurriculo;
	}

	public List<TblPlaneadore> getTblPlaneadores() {
		return this.tblPlaneadores;
	}

	public void setTblPlaneadores(List<TblPlaneadore> tblPlaneadores) {
		this.tblPlaneadores = tblPlaneadores;
	}

	public TblPlaneadore addTblPlaneadore(TblPlaneadore tblPlaneadore) {
		getTblPlaneadores().add(tblPlaneadore);
		tblPlaneadore.setTblAsignatura(this);

		return tblPlaneadore;
	}

	public TblPlaneadore removeTblPlaneadore(TblPlaneadore tblPlaneadore) {
		getTblPlaneadores().remove(tblPlaneadore);
		tblPlaneadore.setTblAsignatura(null);

		return tblPlaneadore;
	}

}