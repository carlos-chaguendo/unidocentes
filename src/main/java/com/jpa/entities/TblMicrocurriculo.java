package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_MICROCURRICULOS database table.
 * 
 */
@Entity
@Table(name="TBL_MICROCURRICULOS")
@NamedQuery(name="TblMicrocurriculo.findAll", query="SELECT t FROM TblMicrocurriculo t")
public class TblMicrocurriculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_MICROCURRICULOS_IDMICROCUR_GENERATOR", sequenceName="SQ_MICROCURR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_MICROCURRICULOS_IDMICROCUR_GENERATOR")
	private long idmicrocur;

	private String competencias;

	private String conocimientosprevios;

	private String estrategiasaprendizaje;

	private String justificacion;

	private String objetivogeneral;

	private BigDecimal periodo;

	private String recursosdidacticos;

	private String sistemaevaluacion;

	//bi-directional many-to-one association to TblBibliografia
	@OneToMany(mappedBy="tblMicrocurriculo")
	private List<TblBibliografia> tblBibliografias;

	//bi-directional many-to-one association to TblAsignatura
	@ManyToOne
	@JoinColumn(name="IDASIGNATURA")
	private TblAsignatura tblAsignatura;

	//bi-directional many-to-one association to TblEstadomicrocurr
	@ManyToOne
	@JoinColumn(name="IDESTADOMICRO")
	private TblEstadomicrocurr tblEstadomicrocurr;

	//bi-directional many-to-one association to TblPlaneadore
	@OneToMany(mappedBy="tblMicrocurriculo")
	private List<TblPlaneadore> tblPlaneadores;

	//bi-directional many-to-one association to TblUnidadmicrocur
	@OneToMany(mappedBy="tblMicrocurriculo")
	private List<TblUnidadmicrocur> tblUnidadmicrocurs;

	public TblMicrocurriculo() {
	}

	public long getIdmicrocur() {
		return this.idmicrocur;
	}

	public void setIdmicrocur(long idmicrocur) {
		this.idmicrocur = idmicrocur;
	}

	public String getCompetencias() {
		return this.competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	public String getConocimientosprevios() {
		return this.conocimientosprevios;
	}

	public void setConocimientosprevios(String conocimientosprevios) {
		this.conocimientosprevios = conocimientosprevios;
	}

	public String getEstrategiasaprendizaje() {
		return this.estrategiasaprendizaje;
	}

	public void setEstrategiasaprendizaje(String estrategiasaprendizaje) {
		this.estrategiasaprendizaje = estrategiasaprendizaje;
	}

	public String getJustificacion() {
		return this.justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public String getObjetivogeneral() {
		return this.objetivogeneral;
	}

	public void setObjetivogeneral(String objetivogeneral) {
		this.objetivogeneral = objetivogeneral;
	}

	public BigDecimal getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(BigDecimal periodo) {
		this.periodo = periodo;
	}

	public String getRecursosdidacticos() {
		return this.recursosdidacticos;
	}

	public void setRecursosdidacticos(String recursosdidacticos) {
		this.recursosdidacticos = recursosdidacticos;
	}

	public String getSistemaevaluacion() {
		return this.sistemaevaluacion;
	}

	public void setSistemaevaluacion(String sistemaevaluacion) {
		this.sistemaevaluacion = sistemaevaluacion;
	}

	public List<TblBibliografia> getTblBibliografias() {
		return this.tblBibliografias;
	}

	public void setTblBibliografias(List<TblBibliografia> tblBibliografias) {
		this.tblBibliografias = tblBibliografias;
	}

	public TblBibliografia addTblBibliografia(TblBibliografia tblBibliografia) {
		getTblBibliografias().add(tblBibliografia);
		tblBibliografia.setTblMicrocurriculo(this);

		return tblBibliografia;
	}

	public TblBibliografia removeTblBibliografia(TblBibliografia tblBibliografia) {
		getTblBibliografias().remove(tblBibliografia);
		tblBibliografia.setTblMicrocurriculo(null);

		return tblBibliografia;
	}

	public TblAsignatura getTblAsignatura() {
		return this.tblAsignatura;
	}

	public void setTblAsignatura(TblAsignatura tblAsignatura) {
		this.tblAsignatura = tblAsignatura;
	}

	public TblEstadomicrocurr getTblEstadomicrocurr() {
		return this.tblEstadomicrocurr;
	}

	public void setTblEstadomicrocurr(TblEstadomicrocurr tblEstadomicrocurr) {
		this.tblEstadomicrocurr = tblEstadomicrocurr;
	}

	public List<TblPlaneadore> getTblPlaneadores() {
		return this.tblPlaneadores;
	}

	public void setTblPlaneadores(List<TblPlaneadore> tblPlaneadores) {
		this.tblPlaneadores = tblPlaneadores;
	}

	public TblPlaneadore addTblPlaneadore(TblPlaneadore tblPlaneadore) {
		getTblPlaneadores().add(tblPlaneadore);
		tblPlaneadore.setTblMicrocurriculo(this);

		return tblPlaneadore;
	}

	public TblPlaneadore removeTblPlaneadore(TblPlaneadore tblPlaneadore) {
		getTblPlaneadores().remove(tblPlaneadore);
		tblPlaneadore.setTblMicrocurriculo(null);

		return tblPlaneadore;
	}

	public List<TblUnidadmicrocur> getTblUnidadmicrocurs() {
		return this.tblUnidadmicrocurs;
	}

	public void setTblUnidadmicrocurs(List<TblUnidadmicrocur> tblUnidadmicrocurs) {
		this.tblUnidadmicrocurs = tblUnidadmicrocurs;
	}

	public TblUnidadmicrocur addTblUnidadmicrocur(TblUnidadmicrocur tblUnidadmicrocur) {
		getTblUnidadmicrocurs().add(tblUnidadmicrocur);
		tblUnidadmicrocur.setTblMicrocurriculo(this);

		return tblUnidadmicrocur;
	}

	public TblUnidadmicrocur removeTblUnidadmicrocur(TblUnidadmicrocur tblUnidadmicrocur) {
		getTblUnidadmicrocurs().remove(tblUnidadmicrocur);
		tblUnidadmicrocur.setTblMicrocurriculo(null);

		return tblUnidadmicrocur;
	}

}