package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblDocente;

public interface DocentesServices {

	public void create(TblDocente docente);

	public void edit(TblDocente docente);

	public void remove(TblDocente docente);

	public TblDocente find(Object idDocente);

	public List<TblDocente> findAll();
}
