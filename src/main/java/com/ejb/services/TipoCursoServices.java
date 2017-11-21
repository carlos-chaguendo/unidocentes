package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblTipocurso;

public interface TipoCursoServices {

	public void create(TblTipocurso tipocurso);

	public void edit(TblTipocurso tipocurso);

	public void remove(TblTipocurso tipocurso);

	public TblTipocurso find(Object idtipocurso);

	public List<TblTipocurso> findAll();
}
