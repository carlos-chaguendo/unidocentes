package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TBL_FUNCIONES database table.
 * 
 */
@Entity
@Table(name="TBL_FUNCIONES")
@NamedQuery(name="TblFuncione.findAll", query="SELECT t FROM TblFuncione t")
public class TblFuncione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_FUNCIONES_IDFUNCION_GENERATOR", sequenceName="SQ_FUNCIONES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_FUNCIONES_IDFUNCION_GENERATOR")
	private long idfuncion;

	private String descripcion;

	private String nombrefuncion;

	//bi-directional many-to-one association to TblRole
	@ManyToOne
	@JoinColumn(name="IDROL")
	private TblRole tblRole;

	public TblFuncione() {
	}

	public long getIdfuncion() {
		return this.idfuncion;
	}

	public void setIdfuncion(long idfuncion) {
		this.idfuncion = idfuncion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombrefuncion() {
		return this.nombrefuncion;
	}

	public void setNombrefuncion(String nombrefuncion) {
		this.nombrefuncion = nombrefuncion;
	}

	public TblRole getTblRole() {
		return this.tblRole;
	}

	public void setTblRole(TblRole tblRole) {
		this.tblRole = tblRole;
	}

}