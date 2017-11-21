package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblEstrategia;

public interface EstrategiaServices {

	public void create(TblEstrategia estrategia);

	public void edit(TblEstrategia estrategia);

	public void remove(TblEstrategia estrategia);

	public TblEstrategia find(Object idEstrategia);

	public List<TblEstrategia> findAll();
}
