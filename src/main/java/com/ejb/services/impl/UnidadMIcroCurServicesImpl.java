package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.UnidadMicroCurServices;
import com.jpa.entities.TblUnidadmicrocur;

@Stateless

public class UnidadMIcroCurServicesImpl extends AbstractFacade<TblUnidadmicrocur> implements UnidadMicroCurServices {



	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public UnidadMIcroCurServicesImpl() {
		super(TblUnidadmicrocur.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
