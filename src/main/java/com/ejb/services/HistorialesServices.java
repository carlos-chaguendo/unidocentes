package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblHistoriale;

public interface HistorialesServices {
	public void create(TblHistoriale historial);

	public void edit(TblHistoriale historial);

	public void remove(TblHistoriale historial);

	public TblHistoriale find(Object idHistorial);

	public List<TblHistoriale> findAll();
}
