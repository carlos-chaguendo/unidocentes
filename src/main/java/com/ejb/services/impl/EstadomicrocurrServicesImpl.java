package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.EstadomicrocurrServices;
import com.jpa.entities.TblEstadomicrocurr;

@Stateless

public class EstadomicrocurrServicesImpl extends AbstractFacade<TblEstadomicrocurr> implements EstadomicrocurrServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public EstadomicrocurrServicesImpl() {
		super(TblEstadomicrocurr.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
