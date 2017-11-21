package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblAsignatura;

public interface AsignaturaServices {
	public void create(TblAsignatura asignaturas);

	public void edit(TblAsignatura asignaturas);

	public void remove(TblAsignatura asignaturas);

	public TblAsignatura find(Object idAsignatura);

	public List<TblAsignatura> findAll();
}
