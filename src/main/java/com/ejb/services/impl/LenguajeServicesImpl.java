package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.LenguajeServices;
import com.jpa.entities.TblLenguaje;

@Stateless
public class LenguajeServicesImpl extends AbstractFacade<TblLenguaje> implements LenguajeServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public LenguajeServicesImpl() {
		super(TblLenguaje.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}