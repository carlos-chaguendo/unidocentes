package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.TemasDadosServices;
import com.jpa.entities.TblTemasdado;

@Stateless

public class TemasDadosServicesImpl extends AbstractFacade<TblTemasdado> implements TemasDadosServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public TemasDadosServicesImpl() {
		super(TblTemasdado.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
