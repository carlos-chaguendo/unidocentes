package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TBL_BITACORAS database table.
 * 
 */
@Entity
@Table(name="TBL_BITACORAS")
@NamedQuery(name="TblBitacora.findAll", query="SELECT t FROM TblBitacora t")
public class TblBitacora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_BITACORAS_IDBITACORA_GENERATOR", sequenceName="SQ_BITACORAS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_BITACORAS_IDBITACORA_GENERATOR")
	private long idbitacora;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal totalhoras;

	//bi-directional many-to-one association to TblPlaneadore
	@ManyToOne
	@JoinColumn(name="IDPLANEADOR")
	private TblPlaneadore tblPlaneadore;

	//bi-directional many-to-one association to TblTemasdado
	@OneToMany(mappedBy="tblBitacora")
	private List<TblTemasdado> tblTemasdados;

	public TblBitacora() {
	}

	public long getIdbitacora() {
		return this.idbitacora;
	}

	public void setIdbitacora(long idbitacora) {
		this.idbitacora = idbitacora;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalhoras() {
		return this.totalhoras;
	}

	public void setTotalhoras(BigDecimal totalhoras) {
		this.totalhoras = totalhoras;
	}

	public TblPlaneadore getTblPlaneadore() {
		return this.tblPlaneadore;
	}

	public void setTblPlaneadore(TblPlaneadore tblPlaneadore) {
		this.tblPlaneadore = tblPlaneadore;
	}

	public List<TblTemasdado> getTblTemasdados() {
		return this.tblTemasdados;
	}

	public void setTblTemasdados(List<TblTemasdado> tblTemasdados) {
		this.tblTemasdados = tblTemasdados;
	}

	public TblTemasdado addTblTemasdado(TblTemasdado tblTemasdado) {
		getTblTemasdados().add(tblTemasdado);
		tblTemasdado.setTblBitacora(this);

		return tblTemasdado;
	}

	public TblTemasdado removeTblTemasdado(TblTemasdado tblTemasdado) {
		getTblTemasdados().remove(tblTemasdado);
		tblTemasdado.setTblBitacora(null);

		return tblTemasdado;
	}

}