package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.MicrocurriculoServices;
import com.jpa.entities.TblMicrocurriculo;

@Stateless
public class MIcrocurriculosServicesImpl extends AbstractFacade<TblMicrocurriculo> implements MicrocurriculoServices{

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public MIcrocurriculosServicesImpl() {
		super(TblMicrocurriculo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
