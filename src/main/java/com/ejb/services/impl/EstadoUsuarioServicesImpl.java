package com.ejb.services.impl;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.EstadoUsuarioServices;
import com.jpa.entities.TblEstadousuario;


@Stateless

public class EstadoUsuarioServicesImpl extends AbstractFacade<TblEstadousuario> implements EstadoUsuarioServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public EstadoUsuarioServicesImpl() {
		super(TblEstadousuario.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}

