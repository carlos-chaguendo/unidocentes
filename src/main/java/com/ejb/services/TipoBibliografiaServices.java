package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblTipobibliografia;;

public interface TipoBibliografiaServices {
	public void create(TblTipobibliografia tipoBiblio);

	public void edit(TblTipobibliografia tipoBiblio);

	public void remove(TblTipobibliografia tipoBiblio);

	public TblTipobibliografia find(Object idTipoBibliografia);

	public List<TblTipobibliografia> findAll();
}
