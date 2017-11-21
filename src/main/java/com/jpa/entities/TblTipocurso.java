package com.jpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the TBL_TIPOCURSO database table.
 *
 */
@Entity
@Table(name="TBL_TIPOCURSO")
@NamedQuery(name="TblTipocurso.findAll", query="SELECT t FROM TblTipocurso t")
public class TblTipocurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_TIPOCURSO_IDTIPOCURSO_GENERATOR", sequenceName="SQ_TIPOCURSO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_TIPOCURSO_IDTIPOCURSO_GENERATOR")
	private long idtipocurso;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to TblAsignatura
	@JsonIgnore
	@OneToMany(mappedBy="tblTipocurso")
	private List<TblAsignatura> tblAsignaturas;

	public TblTipocurso() {
	}

	public long getIdtipocurso() {
		return this.idtipocurso;
	}

	public void setIdtipocurso(long idtipocurso) {
		this.idtipocurso = idtipocurso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TblAsignatura> getTblAsignaturas() {
		return this.tblAsignaturas;
	}

	public void setTblAsignaturas(List<TblAsignatura> tblAsignaturas) {
		this.tblAsignaturas = tblAsignaturas;
	}

	public TblAsignatura addTblAsignatura(TblAsignatura tblAsignatura) {
		getTblAsignaturas().add(tblAsignatura);
		tblAsignatura.setTblTipocurso(this);

		return tblAsignatura;
	}

	public TblAsignatura removeTblAsignatura(TblAsignatura tblAsignatura) {
		getTblAsignaturas().remove(tblAsignatura);
		tblAsignatura.setTblTipocurso(null);

		return tblAsignatura;
	}

}