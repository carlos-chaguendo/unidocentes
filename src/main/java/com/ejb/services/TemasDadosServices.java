package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblTemasdado;

public interface TemasDadosServices {
	public void create(TblTemasdado temasDados);

	public void edit(TblTemasdado temasDados);

	public void remove(TblTemasdado temasDados);

	public TblTemasdado find(Object idTemasDados);

	public List<TblTemasdado> findAll();
}
