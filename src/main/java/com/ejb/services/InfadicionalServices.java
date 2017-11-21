package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblInfadicional;

public interface InfadicionalServices {
	public void create(TblInfadicional infAdicional);

	public void edit(TblInfadicional infAdicional);

	public void remove(TblInfadicional infAdicional);

	public TblInfadicional find(Object idInfAdicional);

	public List<TblInfadicional> findAll();
}
