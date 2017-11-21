package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_USUARIOS database table.
 * 
 */
@Entity
@Table(name="TBL_USUARIOS")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_USUARIOS_IDUSUARIO_GENERATOR", sequenceName="SQ_USUARIOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_USUARIOS_IDUSUARIO_GENERATOR")
	private long idusuario;

	private String contrasena;

	private String emailusuario;

	//bi-directional many-to-one association to TblHistoriale
	@OneToMany(mappedBy="tblUsuario")
	private List<TblHistoriale> tblHistoriales;

	//bi-directional many-to-one association to TblEstadousuario
	@ManyToOne
	@JoinColumn(name="IDESTADO")
	private TblEstadousuario tblEstadousuario;

	//bi-directional many-to-one association to TblRole
	@ManyToOne
	@JoinColumn(name="IDROL")
	private TblRole tblRole;

	public TblUsuario() {
	}

	public long getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmailusuario() {
		return this.emailusuario;
	}

	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}

	public List<TblHistoriale> getTblHistoriales() {
		return this.tblHistoriales;
	}

	public void setTblHistoriales(List<TblHistoriale> tblHistoriales) {
		this.tblHistoriales = tblHistoriales;
	}

	public TblHistoriale addTblHistoriale(TblHistoriale tblHistoriale) {
		getTblHistoriales().add(tblHistoriale);
		tblHistoriale.setTblUsuario(this);

		return tblHistoriale;
	}

	public TblHistoriale removeTblHistoriale(TblHistoriale tblHistoriale) {
		getTblHistoriales().remove(tblHistoriale);
		tblHistoriale.setTblUsuario(null);

		return tblHistoriale;
	}

	public TblEstadousuario getTblEstadousuario() {
		return this.tblEstadousuario;
	}

	public void setTblEstadousuario(TblEstadousuario tblEstadousuario) {
		this.tblEstadousuario = tblEstadousuario;
	}

	public TblRole getTblRole() {
		return this.tblRole;
	}

	public void setTblRole(TblRole tblRole) {
		this.tblRole = tblRole;
	}

}