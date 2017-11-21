package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_PLANEADORES database table.
 * 
 */
@Entity
@Table(name="TBL_PLANEADORES")
@NamedQuery(name="TblPlaneadore.findAll", query="SELECT t FROM TblPlaneadore t")
public class TblPlaneadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_PLANEADORES_IDPLANEADOR_GENERATOR", sequenceName="SQ_PLANEADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_PLANEADORES_IDPLANEADOR_GENERATOR")
	private long idplaneador;

	private String descripcionactividad;

	private String nombreactividad;

	private String observaciones;

	private BigDecimal periodo;

	//bi-directional many-to-one association to TblBitacora
	@OneToMany(mappedBy="tblPlaneadore")
	private List<TblBitacora> tblBitacoras;

	//bi-directional many-to-one association to TblEvaluacione
	@OneToMany(mappedBy="tblPlaneadore")
	private List<TblEvaluacione> tblEvaluaciones;

	//bi-directional many-to-one association to TblInfadicional
	@OneToMany(mappedBy="tblPlaneadore")
	private List<TblInfadicional> tblInfadicionals;

	//bi-directional many-to-one association to TblAsignatura
	@ManyToOne
	@JoinColumn(name="IDASIGNATURA")
	private TblAsignatura tblAsignatura;

	//bi-directional many-to-one association to TblMicrocurriculo
	@ManyToOne
	@JoinColumn(name="IDMICROCURRICULO")
	private TblMicrocurriculo tblMicrocurriculo;

	public TblPlaneadore() {
	}

	public long getIdplaneador() {
		return this.idplaneador;
	}

	public void setIdplaneador(long idplaneador) {
		this.idplaneador = idplaneador;
	}

	public String getDescripcionactividad() {
		return this.descripcionactividad;
	}

	public void setDescripcionactividad(String descripcionactividad) {
		this.descripcionactividad = descripcionactividad;
	}

	public String getNombreactividad() {
		return this.nombreactividad;
	}

	public void setNombreactividad(String nombreactividad) {
		this.nombreactividad = nombreactividad;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public BigDecimal getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(BigDecimal periodo) {
		this.periodo = periodo;
	}

	public List<TblBitacora> getTblBitacoras() {
		return this.tblBitacoras;
	}

	public void setTblBitacoras(List<TblBitacora> tblBitacoras) {
		this.tblBitacoras = tblBitacoras;
	}

	public TblBitacora addTblBitacora(TblBitacora tblBitacora) {
		getTblBitacoras().add(tblBitacora);
		tblBitacora.setTblPlaneadore(this);

		return tblBitacora;
	}

	public TblBitacora removeTblBitacora(TblBitacora tblBitacora) {
		getTblBitacoras().remove(tblBitacora);
		tblBitacora.setTblPlaneadore(null);

		return tblBitacora;
	}

	public List<TblEvaluacione> getTblEvaluaciones() {
		return this.tblEvaluaciones;
	}

	public void setTblEvaluaciones(List<TblEvaluacione> tblEvaluaciones) {
		this.tblEvaluaciones = tblEvaluaciones;
	}

	public TblEvaluacione addTblEvaluacione(TblEvaluacione tblEvaluacione) {
		getTblEvaluaciones().add(tblEvaluacione);
		tblEvaluacione.setTblPlaneadore(this);

		return tblEvaluacione;
	}

	public TblEvaluacione removeTblEvaluacione(TblEvaluacione tblEvaluacione) {
		getTblEvaluaciones().remove(tblEvaluacione);
		tblEvaluacione.setTblPlaneadore(null);

		return tblEvaluacione;
	}

	public List<TblInfadicional> getTblInfadicionals() {
		return this.tblInfadicionals;
	}

	public void setTblInfadicionals(List<TblInfadicional> tblInfadicionals) {
		this.tblInfadicionals = tblInfadicionals;
	}

	public TblInfadicional addTblInfadicional(TblInfadicional tblInfadicional) {
		getTblInfadicionals().add(tblInfadicional);
		tblInfadicional.setTblPlaneadore(this);

		return tblInfadicional;
	}

	public TblInfadicional removeTblInfadicional(TblInfadicional tblInfadicional) {
		getTblInfadicionals().remove(tblInfadicional);
		tblInfadicional.setTblPlaneadore(null);

		return tblInfadicional;
	}

	public TblAsignatura getTblAsignatura() {
		return this.tblAsignatura;
	}

	public void setTblAsignatura(TblAsignatura tblAsignatura) {
		this.tblAsignatura = tblAsignatura;
	}

	public TblMicrocurriculo getTblMicrocurriculo() {
		return this.tblMicrocurriculo;
	}

	public void setTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		this.tblMicrocurriculo = tblMicrocurriculo;
	}

}