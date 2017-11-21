package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblEstadousuario;


public interface EstadoUsuarioServices {
	public void create(TblEstadousuario estadoUsuario);

	public void edit(TblEstadousuario estadoUsuario);

	public void remove(TblEstadousuario estadoUsuario);

	public TblEstadousuario find(Object idEstadoUsuario);

	public List<TblEstadousuario> findAll();
}
