package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_TIPOBIBLIOGRAFIA database table.
 * 
 */
@Entity
@Table(name="TBL_TIPOBIBLIOGRAFIA")
@NamedQuery(name="TblTipobibliografia.findAll", query="SELECT t FROM TblTipobibliografia t")
public class TblTipobibliografia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_TIPOBIBLIOGRAFIA_IDTIPOBIBLIOGRAFIA_GENERATOR", sequenceName="SQ_TIPO_BIBLIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_TIPOBIBLIOGRAFIA_IDTIPOBIBLIOGRAFIA_GENERATOR")
	private long idtipobibliografia;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to TblBibliografia
	@OneToMany(mappedBy="tblTipobibliografia")
	private List<TblBibliografia> tblBibliografias;

	public TblTipobibliografia() {
	}

	public long getIdtipobibliografia() {
		return this.idtipobibliografia;
	}

	public void setIdtipobibliografia(long idtipobibliografia) {
		this.idtipobibliografia = idtipobibliografia;
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
		tblBibliografia.setTblTipobibliografia(this);

		return tblBibliografia;
	}

	public TblBibliografia removeTblBibliografia(TblBibliografia tblBibliografia) {
		getTblBibliografias().remove(tblBibliografia);
		tblBibliografia.setTblTipobibliografia(null);

		return tblBibliografia;
	}

}