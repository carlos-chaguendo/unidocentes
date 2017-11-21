package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.HistorialesServices;
import com.jpa.entities.TblHistoriale;

@Stateless
public class HistorialesServicesImpl extends AbstractFacade<TblHistoriale> implements HistorialesServices{

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;


	public HistorialesServicesImpl() {
		super(TblHistoriale.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
