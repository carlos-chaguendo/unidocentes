package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.BitacorasServices;
import com.jpa.entities.TblBitacora;

@Stateless

public class BitacorasServicesImpl extends AbstractFacade<TblBitacora> implements BitacorasServices {
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public BitacorasServicesImpl() {
		super(TblBitacora.class);
	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
