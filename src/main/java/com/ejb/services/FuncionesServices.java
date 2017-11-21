package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblFuncione;

public interface FuncionesServices {
	public void create(TblFuncione funcion);

	public void edit(TblFuncione funcion);

	public void remove(TblFuncione funcion);

	public TblFuncione find(Object idFuncion);

	public List<TblFuncione> findAll();
}
