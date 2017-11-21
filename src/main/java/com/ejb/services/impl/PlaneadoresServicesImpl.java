package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.PlaneadoresServices;
import com.jpa.entities.TblPlaneadore;

@Stateless

public class PlaneadoresServicesImpl extends AbstractFacade<TblPlaneadore> implements PlaneadoresServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;


	public PlaneadoresServicesImpl() {
		super(TblPlaneadore.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
