package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblRole;

public interface RolesServices {
	public void create(TblRole roles);

	public void edit(TblRole roles);

	public void remove(TblRole roles);

	public TblRole find(Object idRol);

	public List<TblRole> findAll();
}
