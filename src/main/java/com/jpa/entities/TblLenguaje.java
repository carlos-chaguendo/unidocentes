package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_LENGUAJE database table.
 * 
 */
@Entity
@Table(name="TBL_LENGUAJE")
@NamedQuery(name="TblLenguaje.findAll", query="SELECT t FROM TblLenguaje t")
public class TblLenguaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_LENGUAJE_IDLENGUAJE_GENERATOR", sequenceName="SQ_LENGUAJE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_LENGUAJE_IDLENGUAJE_GENERATOR")
	private long idlenguaje;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to TblBibliografia
	@OneToMany(mappedBy="tblLenguaje")
	private List<TblBibliografia> tblBibliografias;

	public TblLenguaje() {
	}

	public long getIdlenguaje() {
		return this.idlenguaje;
	}

	public void setIdlenguaje(long idlenguaje) {
		this.idlenguaje = idlenguaje;
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

	public List<TblBibliografia> getTblBibliografias() {
		return this.tblBibliografias;
	}

	public void setTblBibliografias(List<TblBibliografia> tblBibliografias) {
		this.tblBibliografias = tblBibliografias;
	}

	public TblBibliografia addTblBibliografia(TblBibliografia tblBibliografia) {
		getTblBibliografias().add(tblBibliografia);
		tblBibliografia.setTblLenguaje(this);

		return tblBibliografia;
	}

	public TblBibliografia removeTblBibliografia(TblBibliografia tblBibliografia) {
		getTblBibliografias().remove(tblBibliografia);
		tblBibliografia.setTblLenguaje(null);

		return tblBibliografia;
	}

}