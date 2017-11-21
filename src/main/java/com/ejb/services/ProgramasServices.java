package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblPrograma;

public interface ProgramasServices {

	public void create(TblPrograma programa);

	public void edit(TblPrograma programa);

	public void remove(TblPrograma programa);

	public TblPrograma find(Object idPrograma);

	public List<TblPrograma> findAll();
}
