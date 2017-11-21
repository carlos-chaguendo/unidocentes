package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_TEMASMICROCUR database table.
 * 
 */
@Entity
@Table(name="TBL_TEMASMICROCUR")
@NamedQuery(name="TblTemasmicrocur.findAll", query="SELECT t FROM TblTemasmicrocur t")
public class TblTemasmicrocur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_TEMASMICROCUR_IDTEMASMICROCUR_GENERATOR", sequenceName="SQ_TEMAS_MICRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_TEMASMICROCUR_IDTEMASMICROCUR_GENERATOR")
	private long idtemasmicrocur;

	private String nombretema;

	//bi-directional many-to-one association to TblTemasdado
	@OneToMany(mappedBy="tblTemasmicrocur")
	private List<TblTemasdado> tblTemasdados;

	//bi-directional many-to-one association to TblUnidadmicrocur
	@ManyToOne
	@JoinColumn(name="IDUNIDADMICROCURR")
	private TblUnidadmicrocur tblUnidadmicrocur;

	public TblTemasmicrocur() {
	}

	public long getIdtemasmicrocur() {
		return this.idtemasmicrocur;
	}

	public void setIdtemasmicrocur(long idtemasmicrocur) {
		this.idtemasmicrocur = idtemasmicrocur;
	}

	public String getNombretema() {
		return this.nombretema;
	}

	public void setNombretema(String nombretema) {
		this.nombretema = nombretema;
	}

	public List<TblTemasdado> getTblTemasdados() {
		return this.tblTemasdados;
	}

	public void setTblTemasdados(List<TblTemasdado> tblTemasdados) {
		this.tblTemasdados = tblTemasdados;
	}

	public TblTemasdado addTblTemasdado(TblTemasdado tblTemasdado) {
		getTblTemasdados().add(tblTemasdado);
		tblTemasdado.setTblTemasmicrocur(this);

		return tblTemasdado;
	}

	public TblTemasdado removeTblTemasdado(TblTemasdado tblTemasdado) {
		getTblTemasdados().remove(tblTemasdado);
		tblTemasdado.setTblTemasmicrocur(null);

		return tblTemasdado;
	}

	public TblUnidadmicrocur getTblUnidadmicrocur() {
		return this.tblUnidadmicrocur;
	}

	public void setTblUnidadmicrocur(TblUnidadmicrocur tblUnidadmicrocur) {
		this.tblUnidadmicrocur = tblUnidadmicrocur;
	}

}