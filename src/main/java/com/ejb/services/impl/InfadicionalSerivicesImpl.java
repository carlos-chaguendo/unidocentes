package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.InfadicionalServices;
import com.jpa.entities.TblInfadicional;

@Stateless

public class InfadicionalSerivicesImpl extends AbstractFacade<TblInfadicional> implements InfadicionalServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public InfadicionalSerivicesImpl() {
		super(TblInfadicional.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
