package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBL_ESTRATEGIA database table.
 * 
 */
@Entity
@Table(name="TBL_ESTRATEGIA")
@NamedQuery(name="TblEstrategia.findAll", query="SELECT t FROM TblEstrategia t")
public class TblEstrategia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ESTRATEGIA_IDESTRATEGIA_GENERATOR", sequenceName="SQ_ESTRATEGIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_ESTRATEGIA_IDESTRATEGIA_GENERATOR")
	private long idestrategia;

	private BigDecimal nombre;

	//bi-directional many-to-one association to TblInfadicional
	@ManyToOne
	@JoinColumn(name="IDINFADICIONAL")
	private TblInfadicional tblInfadicional;

	public TblEstrategia() {
	}

	public long getIdestrategia() {
		return this.idestrategia;
	}

	public void setIdestrategia(long idestrategia) {
		this.idestrategia = idestrategia;
	}

	public BigDecimal getNombre() {
		return this.nombre;
	}

	public void setNombre(BigDecimal nombre) {
		this.nombre = nombre;
	}

	public TblInfadicional getTblInfadicional() {
		return this.tblInfadicional;
	}

	public void setTblInfadicional(TblInfadicional tblInfadicional) {
		this.tblInfadicional = tblInfadicional;
	}

}