package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblEvaluacione;

public interface EvaluacionesServices {
	public void create(TblEvaluacione evaluaciones);

	public void edit(TblEvaluacione evaluaciones);

	public void remove(TblEvaluacione evaluaciones);

	public TblEvaluacione find(Object idEvaluacion);

	public List<TblEvaluacione> findAll();
}
