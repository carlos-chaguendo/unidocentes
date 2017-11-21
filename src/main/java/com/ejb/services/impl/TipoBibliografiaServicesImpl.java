package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.TipoBibliografiaServices;
import com.jpa.entities.TblTipobibliografia;

@Stateless

public class TipoBibliografiaServicesImpl extends AbstractFacade<TblTipobibliografia> implements TipoBibliografiaServices {


	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public TipoBibliografiaServicesImpl() {
		super(TblTipobibliografia.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
