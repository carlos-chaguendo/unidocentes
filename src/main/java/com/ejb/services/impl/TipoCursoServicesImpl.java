package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.TipoCursoServices;
import com.jpa.entities.TblTipocurso;

@Stateless
public class TipoCursoServicesImpl extends AbstractFacade<TblTipocurso> implements TipoCursoServices {

	public TipoCursoServicesImpl() {
		super(TblTipocurso.class);
	}

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
