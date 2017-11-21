package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.DocentesServices;
import com.jpa.entities.TblDocente;

@Stateless
public class DocentesServicesImpl extends AbstractFacade<TblDocente> implements DocentesServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public DocentesServicesImpl() {
		super(TblDocente .class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
