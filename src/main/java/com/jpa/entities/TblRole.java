package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_ROLES database table.
 * 
 */
@Entity
@Table(name="TBL_ROLES")
@NamedQuery(name="TblRole.findAll", query="SELECT t FROM TblRole t")
public class TblRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ROLES_IDROL_GENERATOR", sequenceName="SQ_ROLES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_ROLES_IDROL_GENERATOR")
	private long idrol;

	private String descripcion;

	private String nombrerol;

	//bi-directional many-to-one association to TblFuncione
	@OneToMany(mappedBy="tblRole")
	private List<TblFuncione> tblFunciones;

	//bi-directional many-to-one association to TblUsuario
	@OneToMany(mappedBy="tblRole")
	private List<TblUsuario> tblUsuarios;

	public TblRole() {
	}

	public long getIdrol() {
		return this.idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombrerol() {
		return this.nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	public List<TblFuncione> getTblFunciones() {
		return this.tblFunciones;
	}

	public void setTblFunciones(List<TblFuncione> tblFunciones) {
		this.tblFunciones = tblFunciones;
	}

	public TblFuncione addTblFuncione(TblFuncione tblFuncione) {
		getTblFunciones().add(tblFuncione);
		tblFuncione.setTblRole(this);

		return tblFuncione;
	}

	public TblFuncione removeTblFuncione(TblFuncione tblFuncione) {
		getTblFunciones().remove(tblFuncione);
		tblFuncione.setTblRole(null);

		return tblFuncione;
	}

	public List<TblUsuario> getTblUsuarios() {
		return this.tblUsuarios;
	}

	public void setTblUsuarios(List<TblUsuario> tblUsuarios) {
		this.tblUsuarios = tblUsuarios;
	}

	public TblUsuario addTblUsuario(TblUsuario tblUsuario) {
		getTblUsuarios().add(tblUsuario);
		tblUsuario.setTblRole(this);

		return tblUsuario;
	}

	public TblUsuario removeTblUsuario(TblUsuario tblUsuario) {
		getTblUsuarios().remove(tblUsuario);
		tblUsuario.setTblRole(null);

		return tblUsuario;
	}

}