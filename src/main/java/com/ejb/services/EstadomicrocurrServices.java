package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblEstadomicrocurr;

public interface EstadomicrocurrServices {
	public void create(TblEstadomicrocurr estadoMicro);

	public void edit(TblEstadomicrocurr estadoMicro);

	public void remove(TblEstadomicrocurr estadoMicro);

	public TblEstadomicrocurr find(Object idEstadoMicro);

	public List<TblEstadomicrocurr> findAll();
}
