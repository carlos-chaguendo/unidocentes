package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.EvaluacionesServices;
import com.jpa.entities.TblEvaluacione;

@Stateless

public class EvaluacionesServicesImpl extends AbstractFacade<TblEvaluacione> implements EvaluacionesServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;



	public EvaluacionesServicesImpl() {
		super(TblEvaluacione.class);

	}



	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
