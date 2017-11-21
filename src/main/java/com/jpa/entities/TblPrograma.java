package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_PROGRAMAS database table.
 * 
 */
@Entity
@Table(name="TBL_PROGRAMAS")
@NamedQuery(name="TblPrograma.findAll", query="SELECT t FROM TblPrograma t")
public class TblPrograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_PROGRAMAS_IDPROGRAMA_GENERATOR", sequenceName="SQ_PROGRAMAS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_PROGRAMAS_IDPROGRAMA_GENERATOR")
	private long idprograma;

	private String codigosnies;

	private String nombreprograma;

	//bi-directional many-to-one association to TblDocente
	@OneToMany(mappedBy="tblPrograma")
	private List<TblDocente> tblDocentes;

	public TblPrograma() {
	}

	public long getIdprograma() {
		return this.idprograma;
	}

	public void setIdprograma(long idprograma) {
		this.idprograma = idprograma;
	}

	public String getCodigosnies() {
		return this.codigosnies;
	}

	public void setCodigosnies(String codigosnies) {
		this.codigosnies = codigosnies;
	}

	public String getNombreprograma() {
		return this.nombreprograma;
	}

	public void setNombreprograma(String nombreprograma) {
		this.nombreprograma = nombreprograma;
	}

	public List<TblDocente> getTblDocentes() {
		return this.tblDocentes;
	}

	public void setTblDocentes(List<TblDocente> tblDocentes) {
		this.tblDocentes = tblDocentes;
	}

	public TblDocente addTblDocente(TblDocente tblDocente) {
		getTblDocentes().add(tblDocente);
		tblDocente.setTblPrograma(this);

		return tblDocente;
	}

	public TblDocente removeTblDocente(TblDocente tblDocente) {
		getTblDocentes().remove(tblDocente);
		tblDocente.setTblPrograma(null);

		return tblDocente;
	}

}