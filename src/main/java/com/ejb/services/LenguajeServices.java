package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblLenguaje;

public interface LenguajeServices {

	public void create(TblLenguaje lenguaje);

	public void edit(TblLenguaje lenguaje);

	public void remove(TblLenguaje lenguaje);

	public TblLenguaje find(Object idLenguaje);

	public List<TblLenguaje> findAll();
}
