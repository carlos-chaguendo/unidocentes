package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblMicrocurriculo;


public interface MicrocurriculoServices {
	public void create(TblMicrocurriculo microcur);

	public void edit(TblMicrocurriculo microcur);

	public void remove(TblMicrocurriculo microcur);

	public TblMicrocurriculo find(Object idMicrocur);

	public List<TblMicrocurriculo> findAll();
}
