package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblBitacora;

public interface BitacorasServices {
	public void create(TblBitacora bitacoras);

	public void edit(TblBitacora bitacoras);

	public void remove(TblBitacora bitacoras);

	public TblBitacora find(Object idBitacora);

	public List<TblBitacora> findAll();
}
