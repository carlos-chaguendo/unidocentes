package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.EstrategiaServices;
import com.jpa.entities.TblEstrategia;

@Stateless
public class EstrategiaServicesImpl extends AbstractFacade<TblEstrategia> implements EstrategiaServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public EstrategiaServicesImpl() {
		super(TblEstrategia.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
