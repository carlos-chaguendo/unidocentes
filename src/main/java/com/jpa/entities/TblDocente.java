package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_DOCENTES database table.
 * 
 */
@Entity
@Table(name="TBL_DOCENTES")
@NamedQuery(name="TblDocente.findAll", query="SELECT t FROM TblDocente t")
public class TblDocente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_DOCENTES_IDDOCENTE_GENERATOR", sequenceName="SQ_DOCENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_DOCENTES_IDDOCENTE_GENERATOR")
	private long iddocente;

	private BigDecimal activo;

	private BigDecimal cedula;

	private BigDecimal celular;

	private String email;

	private String nombredocente;

	//bi-directional many-to-one association to TblAsignatura
	@OneToMany(mappedBy="tblDocente")
	private List<TblAsignatura> tblAsignaturas;

	//bi-directional many-to-one association to TblPrograma
	@ManyToOne
	@JoinColumn(name="IDPROGRAMA")
	private TblPrograma tblPrograma;

	public TblDocente() {
	}

	public long getIddocente() {
		return this.iddocente;
	}

	public void setIddocente(long iddocente) {
		this.iddocente = iddocente;
	}

	public BigDecimal getActivo() {
		return this.activo;
	}

	public void setActivo(BigDecimal activo) {
		this.activo = activo;
	}

	public BigDecimal getCedula() {
		return this.cedula;
	}

	public void setCedula(BigDecimal cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getCelular() {
		return this.celular;
	}

	public void setCelular(BigDecimal celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombredocente() {
		return this.nombredocente;
	}

	public void setNombredocente(String nombredocente) {
		this.nombredocente = nombredocente;
	}

	public List<TblAsignatura> getTblAsignaturas() {
		return this.tblAsignaturas;
	}

	public void setTblAsignaturas(List<TblAsignatura> tblAsignaturas) {
		this.tblAsignaturas = tblAsignaturas;
	}

	public TblAsignatura addTblAsignatura(TblAsignatura tblAsignatura) {
		getTblAsignaturas().add(tblAsignatura);
		tblAsignatura.setTblDocente(this);

		return tblAsignatura;
	}

	public TblAsignatura removeTblAsignatura(TblAsignatura tblAsignatura) {
		getTblAsignaturas().remove(tblAsignatura);
		tblAsignatura.setTblDocente(null);

		return tblAsignatura;
	}

	public TblPrograma getTblPrograma() {
		return this.tblPrograma;
	}

	public void setTblPrograma(TblPrograma tblPrograma) {
		this.tblPrograma = tblPrograma;
	}

}