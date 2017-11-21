package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblPlaneadore;

public interface PlaneadoresServices {
	public void create(TblPlaneadore planeadores);

	public void edit(TblPlaneadore planeadores);

	public void remove(TblPlaneadore planeadores);

	public TblPlaneadore find(Object idPlaneador);

	public List<TblPlaneadore> findAll();
}
