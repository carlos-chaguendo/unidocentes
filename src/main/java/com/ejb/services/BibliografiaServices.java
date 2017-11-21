package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblBibliografia;

public interface BibliografiaServices {
	public void create(TblBibliografia bibliografia);

	public void edit(TblBibliografia bibliografia);

	public void remove(TblBibliografia bibliografia);

	public TblBibliografia find(Object idBibliografia);

	public List<TblBibliografia> findAll();
}
