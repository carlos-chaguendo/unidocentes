package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_ESTADOMICROCURR database table.
 * 
 */
@Entity
@Table(name="TBL_ESTADOMICROCURR")
@NamedQuery(name="TblEstadomicrocurr.findAll", query="SELECT t FROM TblEstadomicrocurr t")
public class TblEstadomicrocurr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ESTADOMICROCURR_IDESTADOMICROCURR_GENERATOR", sequenceName="SQ_ESTADO_MICRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_ESTADOMICROCURR_IDESTADOMICROCURR_GENERATOR")
	private long idestadomicrocurr;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to TblMicrocurriculo
	@OneToMany(mappedBy="tblEstadomicrocurr")
	private List<TblMicrocurriculo> tblMicrocurriculos;

	public TblEstadomicrocurr() {
	}

	public long getIdestadomicrocurr() {
		return this.idestadomicrocurr;
	}

	public void setIdestadomicrocurr(long idestadomicrocurr) {
		this.idestadomicrocurr = idestadomicrocurr;
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

	public List<TblMicrocurriculo> getTblMicrocurriculos() {
		return this.tblMicrocurriculos;
	}

	public void setTblMicrocurriculos(List<TblMicrocurriculo> tblMicrocurriculos) {
		this.tblMicrocurriculos = tblMicrocurriculos;
	}

	public TblMicrocurriculo addTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		getTblMicrocurriculos().add(tblMicrocurriculo);
		tblMicrocurriculo.setTblEstadomicrocurr(this);

		return tblMicrocurriculo;
	}

	public TblMicrocurriculo removeTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		getTblMicrocurriculos().remove(tblMicrocurriculo);
		tblMicrocurriculo.setTblEstadomicrocurr(null);

		return tblMicrocurriculo;
	}

}