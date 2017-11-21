package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TBL_TEMASDADOS database table.
 * 
 */
@Entity
@Table(name="TBL_TEMASDADOS")
@NamedQuery(name="TblTemasdado.findAll", query="SELECT t FROM TblTemasdado t")
public class TblTemasdado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_TEMASDADOS_IDTEMASDADOS_GENERATOR", sequenceName="SQ_TEMAS_DADOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_TEMASDADOS_IDTEMASDADOS_GENERATOR")
	private long idtemasdados;

	//bi-directional many-to-one association to TblBitacora
	@ManyToOne
	@JoinColumn(name="IDBITACORA")
	private TblBitacora tblBitacora;

	//bi-directional many-to-one association to TblTemasmicrocur
	@ManyToOne
	@JoinColumn(name="IDTEMAMICROCURR")
	private TblTemasmicrocur tblTemasmicrocur;

	public TblTemasdado() {
	}

	public long getIdtemasdados() {
		return this.idtemasdados;
	}

	public void setIdtemasdados(long idtemasdados) {
		this.idtemasdados = idtemasdados;
	}

	public TblBitacora getTblBitacora() {
		return this.tblBitacora;
	}

	public void setTblBitacora(TblBitacora tblBitacora) {
		this.tblBitacora = tblBitacora;
	}

	public TblTemasmicrocur getTblTemasmicrocur() {
		return this.tblTemasmicrocur;
	}

	public void setTblTemasmicrocur(TblTemasmicrocur tblTemasmicrocur) {
		this.tblTemasmicrocur = tblTemasmicrocur;
	}

}