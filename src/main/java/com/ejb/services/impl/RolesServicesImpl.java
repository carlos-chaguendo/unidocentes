package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.RolesServices;
import com.jpa.entities.TblRole;

@Stateless

public class RolesServicesImpl extends AbstractFacade<TblRole> implements RolesServices{
@PersistenceContext(name = "unidocentes")
private EntityManager em;

	public RolesServicesImpl() {
		super(TblRole.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
