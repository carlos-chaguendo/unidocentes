package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_INFADICIONAL database table.
 * 
 */
@Entity
@Table(name="TBL_INFADICIONAL")
@NamedQuery(name="TblInfadicional.findAll", query="SELECT t FROM TblInfadicional t")
public class TblInfadicional implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_INFADICIONAL_IDINFADICIONAL_GENERATOR", sequenceName="SQ_INFOADICIONAL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_INFADICIONAL_IDINFADICIONAL_GENERATOR")
	private long idinfadicional;

	private String bibliografia;

	private BigDecimal horasindividual;

	private BigDecimal horaspresencial;

	private String objetivoespecifico;

	//bi-directional many-to-one association to TblEstrategia
	@OneToMany(mappedBy="tblInfadicional")
	private List<TblEstrategia> tblEstrategias;

	//bi-directional many-to-one association to TblPlaneadore
	@ManyToOne
	@JoinColumn(name="IDPLANEADOR")
	private TblPlaneadore tblPlaneadore;

	//bi-directional many-to-one association to TblUnidadmicrocur
	@ManyToOne
	@JoinColumn(name="IDUNIDADMICROCUR")
	private TblUnidadmicrocur tblUnidadmicrocur;

	public TblInfadicional() {
	}

	public long getIdinfadicional() {
		return this.idinfadicional;
	}

	public void setIdinfadicional(long idinfadicional) {
		this.idinfadicional = idinfadicional;
	}

	public String getBibliografia() {
		return this.bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public BigDecimal getHorasindividual() {
		return this.horasindividual;
	}

	public void setHorasindividual(BigDecimal horasindividual) {
		this.horasindividual = horasindividual;
	}

	public BigDecimal getHoraspresencial() {
		return this.horaspresencial;
	}

	public void setHoraspresencial(BigDecimal horaspresencial) {
		this.horaspresencial = horaspresencial;
	}

	public String getObjetivoespecifico() {
		return this.objetivoespecifico;
	}

	public void setObjetivoespecifico(String objetivoespecifico) {
		this.objetivoespecifico = objetivoespecifico;
	}

	public List<TblEstrategia> getTblEstrategias() {
		return this.tblEstrategias;
	}

	public void setTblEstrategias(List<TblEstrategia> tblEstrategias) {
		this.tblEstrategias = tblEstrategias;
	}

	public TblEstrategia addTblEstrategia(TblEstrategia tblEstrategia) {
		getTblEstrategias().add(tblEstrategia);
		tblEstrategia.setTblInfadicional(this);

		return tblEstrategia;
	}

	public TblEstrategia removeTblEstrategia(TblEstrategia tblEstrategia) {
		getTblEstrategias().remove(tblEstrategia);
		tblEstrategia.setTblInfadicional(null);

		return tblEstrategia;
	}

	public TblPlaneadore getTblPlaneadore() {
		return this.tblPlaneadore;
	}

	public void setTblPlaneadore(TblPlaneadore tblPlaneadore) {
		this.tblPlaneadore = tblPlaneadore;
	}

	public TblUnidadmicrocur getTblUnidadmicrocur() {
		return this.tblUnidadmicrocur;
	}

	public void setTblUnidadmicrocur(TblUnidadmicrocur tblUnidadmicrocur) {
		this.tblUnidadmicrocur = tblUnidadmicrocur;
	}

}