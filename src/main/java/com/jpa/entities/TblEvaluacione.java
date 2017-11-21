package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBL_EVALUACIONES database table.
 * 
 */
@Entity
@Table(name="TBL_EVALUACIONES")
@NamedQuery(name="TblEvaluacione.findAll", query="SELECT t FROM TblEvaluacione t")
public class TblEvaluacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_EVALUACIONES_IDEVALUACION_GENERATOR", sequenceName="SQ_EVALUACIONES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_EVALUACIONES_IDEVALUACION_GENERATOR")
	private long idevaluacion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal idtipoevaluacion;

	private BigDecimal porcentaje;

	private String tematica;

	//bi-directional many-to-one association to TblPlaneadore
	@ManyToOne
	@JoinColumn(name="IDPLANEADOR")
	private TblPlaneadore tblPlaneadore;

	public TblEvaluacione() {
	}

	public long getIdevaluacion() {
		return this.idevaluacion;
	}

	public void setIdevaluacion(long idevaluacion) {
		this.idevaluacion = idevaluacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getIdtipoevaluacion() {
		return this.idtipoevaluacion;
	}

	public void setIdtipoevaluacion(BigDecimal idtipoevaluacion) {
		this.idtipoevaluacion = idtipoevaluacion;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getTematica() {
		return this.tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public TblPlaneadore getTblPlaneadore() {
		return this.tblPlaneadore;
	}

	public void setTblPlaneadore(TblPlaneadore tblPlaneadore) {
		this.tblPlaneadore = tblPlaneadore;
	}

}