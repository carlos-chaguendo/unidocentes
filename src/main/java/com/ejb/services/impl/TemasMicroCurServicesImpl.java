package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.TemasMicroCurServices;
import com.jpa.entities.TblTemasmicrocur;

@Stateless

public class TemasMicroCurServicesImpl extends AbstractFacade<TblTemasmicrocur> implements TemasMicroCurServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public TemasMicroCurServicesImpl() {
		super(TblTemasmicrocur.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
