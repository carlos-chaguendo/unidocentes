package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBL_HISTORIALES database table.
 * 
 */
@Entity
@Table(name="TBL_HISTORIALES")
@NamedQuery(name="TblHistoriale.findAll", query="SELECT t FROM TblHistoriale t")
public class TblHistoriale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_HISTORIALES_IDHISTORIAL_GENERATOR", sequenceName="SQ_HISTORIALES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_HISTORIALES_IDHISTORIAL_GENERATOR")
	private long idhistorial;

	private String codigo;

	private BigDecimal errores;

	private String funcion;

	@Temporal(TemporalType.DATE)
	private Date horafecha;

	private String mensaje;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="IDUSUARIO")
	private TblUsuario tblUsuario;

	public TblHistoriale() {
	}

	public long getIdhistorial() {
		return this.idhistorial;
	}

	public void setIdhistorial(long idhistorial) {
		this.idhistorial = idhistorial;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getErrores() {
		return this.errores;
	}

	public void setErrores(BigDecimal errores) {
		this.errores = errores;
	}

	public String getFuncion() {
		return this.funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public Date getHorafecha() {
		return this.horafecha;
	}

	public void setHorafecha(Date horafecha) {
		this.horafecha = horafecha;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

}