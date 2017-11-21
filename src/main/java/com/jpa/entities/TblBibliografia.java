package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBL_BIBLIOGRAFIA database table.
 * 
 */
@Entity
@Table(name="TBL_BIBLIOGRAFIA")
@NamedQuery(name="TblBibliografia.findAll", query="SELECT t FROM TblBibliografia t")
public class TblBibliografia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_BIBLIOGRAFIA_IDBIBLIOGRAFIA_GENERATOR", sequenceName="SQ_BIBLIOGRAFIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_BIBLIOGRAFIA_IDBIBLIOGRAFIA_GENERATOR")
	private long idbibliografia;

	private BigDecimal ano;

	private String autor;

	private String editorial;

	private String titulo;

	//bi-directional many-to-one association to TblLenguaje
	@ManyToOne
	@JoinColumn(name="IDLENGUA")
	private TblLenguaje tblLenguaje;

	//bi-directional many-to-one association to TblMicrocurriculo
	@ManyToOne
	@JoinColumn(name="IDMICROCUR")
	private TblMicrocurriculo tblMicrocurriculo;

	//bi-directional many-to-one association to TblTipobibliografia
	@ManyToOne
	@JoinColumn(name="IDTIPOBIBLIOGRAFIA")
	private TblTipobibliografia tblTipobibliografia;

	public TblBibliografia() {
	}

	public long getIdbibliografia() {
		return this.idbibliografia;
	}

	public void setIdbibliografia(long idbibliografia) {
		this.idbibliografia = idbibliografia;
	}

	public BigDecimal getAno() {
		return this.ano;
	}

	public void setAno(BigDecimal ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TblLenguaje getTblLenguaje() {
		return this.tblLenguaje;
	}

	public void setTblLenguaje(TblLenguaje tblLenguaje) {
		this.tblLenguaje = tblLenguaje;
	}

	public TblMicrocurriculo getTblMicrocurriculo() {
		return this.tblMicrocurriculo;
	}

	public void setTblMicrocurriculo(TblMicrocurriculo tblMicrocurriculo) {
		this.tblMicrocurriculo = tblMicrocurriculo;
	}

	public TblTipobibliografia getTblTipobibliografia() {
		return this.tblTipobibliografia;
	}

	public void setTblTipobibliografia(TblTipobibliografia tblTipobibliografia) {
		this.tblTipobibliografia = tblTipobibliografia;
	}

}