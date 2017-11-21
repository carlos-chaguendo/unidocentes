package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.AsignaturaServices;
import com.jpa.entities.TblAsignatura;

@Stateless
public class AsignaturasServicesImpl extends AbstractFacade<TblAsignatura> implements AsignaturaServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public AsignaturasServicesImpl() {
		super(TblAsignatura.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
