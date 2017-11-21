package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.FuncionesServices;
import com.jpa.entities.TblFuncione;

@Stateless

public class FuncionesServicesImpl extends AbstractFacade<TblFuncione> implements FuncionesServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public FuncionesServicesImpl() {
		super(TblFuncione.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}


}
