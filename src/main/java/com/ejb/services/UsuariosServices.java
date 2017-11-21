package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblUsuario;

public interface UsuariosServices {
	public void create(TblUsuario usuario);

	public void edit(TblUsuario usuario);

	public void remove(TblUsuario usuario);

	public TblUsuario find(Object idRol);

	public List<TblUsuario> findAll();
}
