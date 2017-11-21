package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_ESTADOUSUARIO database table.
 * 
 */
@Entity
@Table(name="TBL_ESTADOUSUARIO")
@NamedQuery(name="TblEstadousuario.findAll", query="SELECT t FROM TblEstadousuario t")
public class TblEstadousuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ESTADOUSUARIO_IDESTADOUSUARIO_GENERATOR", sequenceName="SQ_ESTADO_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TBL_ESTADOUSUARIO_IDESTADOUSUARIO_GENERATOR")
	private long idestadousuario;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to TblUsuario
	@OneToMany(mappedBy="tblEstadousuario")
	private List<TblUsuario> tblUsuarios;

	public TblEstadousuario() {
	}

	public long getIdestadousuario() {
		return this.idestadousuario;
	}

	public void setIdestadousuario(long idestadousuario) {
		this.idestadousuario = idestadousuario;
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

	public List<TblUsuario> getTblUsuarios() {
		return this.tblUsuarios;
	}

	public void setTblUsuarios(List<TblUsuario> tblUsuarios) {
		this.tblUsuarios = tblUsuarios;
	}

	public TblUsuario addTblUsuario(TblUsuario tblUsuario) {
		getTblUsuarios().add(tblUsuario);
		tblUsuario.setTblEstadousuario(this);

		return tblUsuario;
	}

	public TblUsuario removeTblUsuario(TblUsuario tblUsuario) {
		getTblUsuarios().remove(tblUsuario);
		tblUsuario.setTblEstadousuario(null);

		return tblUsuario;
	}

}