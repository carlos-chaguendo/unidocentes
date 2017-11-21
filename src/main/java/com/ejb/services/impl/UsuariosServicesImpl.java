package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.UsuariosServices;
import com.jpa.entities.TblUsuario;

@Stateless

public class UsuariosServicesImpl extends AbstractFacade<TblUsuario> implements UsuariosServices{
	@PersistenceContext(name = "unidocentes")
	private EntityManager em;
	public UsuariosServicesImpl() {
		super(TblUsuario.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return em;
	}

}
