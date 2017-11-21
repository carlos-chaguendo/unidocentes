package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.ProgramasServices;
import com.jpa.entities.TblPrograma;

@Stateless
public class ProgramasServicesImpl extends AbstractFacade<TblPrograma> implements ProgramasServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public ProgramasServicesImpl() {
		super(TblPrograma.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}
