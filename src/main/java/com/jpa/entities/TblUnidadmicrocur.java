package com.jpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the TBL_UNIDADMICROCUR database table.
 *
 */
@Entity
@Table(name="TBL_UNIDADMICROCUR")
@NamedQuery(name="TblUnidadmicrocur.findAll", query="SELECT t FROM TblUnidadmicrocur t")
public class TblUnidadmicrocur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_UNIDADMICROCUR_IDUNIDADMICROCURR_GENERATOR", sequenceName="SQ_UNIDADMICRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_UNIDADMICROCUR_IDUNIDADMICROCURR_GENERATOR")
	private long idunidadmicrocurr;

	private String nombreunidad;

	//bi-directional many-to-one association to TblInfadicional
	@OneToMany(mappedBy="tblUnidadmicrocur")
	private List<TblInfadicional> tblInfadicionals;

	//bi-directional many-to-one association to TblTemasmicrocur
	@OneToMany(mappedBy="tblUnidadmicrocur")
	private List<TblTemasmicrocur> tblTemasmicrocurs;

	//bi-directional many-to-one association to TblMicrocurriculo
	@ManyToOne
	@JoinColumn(name="IDMICROCUR")
	private TblMicrocurriculo tblMicrocurriculo;

	public TblUnidadmicrocur() {
	}

	public long getIdunidadmicrocurr() {
		return this.idunidadmicrocurr;
	}

	public void setIdunidadmicrocurr(long idunidadmicrocurr) {
		this.idunidadmicrocurr = idunidadmicrocurr;
	}

	public String getNombreunidad() {
		return this.nombreunidad;
	}

	public void setNombreunidad(String nombreunidad) {
		this.nombreunidad = nombreunidad;
	}

	public List<TblInfadicional> getTblInfadicionals() {
		return this.tblInfadicionals;
	}

	public void setTblInfadicionals(List<TblInfadicional> tblInfadicionals) {
		this.tblInfadicionals = tblInfadicionals;
	}

	public TblInfadicional addTblInfadicional(TblInfadicional tblInfadicional) {
		getTblInfadicionals().add(tblInfadicional);
		tblInfadicional.setTblUnidadmicrocur(this);

		return tblInfadicional;
	}

	public TblInfadicional removeTblInfadicional(TblInfadicional tblInfadicional) {
		getTblInfadicionals().remove(tblInfadicional);
		tblInfadicional.setTblUnidadmicrocur(null);

		return tblInfadicional;
	}

	public List<TblTemasmicrocur> getTblTemasmicrocurs() {
		return this.tblTemasmicrocurs;
	}

	public void setTblTemasmicrocurs(List<TblTemasmicrocur> tblTemasmicrocurs) {
		this.tblTemasmicrocurs = tblTemasmicrocurs;
	}

	public TblTemasmicrocur addTblTemasmicrocur(TblTemasmicrocur tblTemasmicrocur) {
		getTblTemasmicrocurs().add(tblTemasmicrocur);
		tblTemasmicrocur.setTblUnidadmicrocur(this);

		return tblTemasmicrocur;
	}

	public TblTemasmicrocur removeTblTemasmicrocur(TblTemasmicrocur tblTemasmicrocur) {
		getTblTemasmicrocurs().remove(tblTemasmicrocur);
		tblTemasmicrocur.setTblUnidadmicrocur(null);

		return tblTemasmicrocur;
	}

	public TblMicrocurriculo getTblMicrocurriculo() {
		return this.tblMicrocurriculo;
	}

	public void setTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		this.tblMicrocurriculo = tblMicrocurriculo;
	}

}