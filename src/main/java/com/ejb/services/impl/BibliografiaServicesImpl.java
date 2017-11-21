package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.BibliografiaServices;
import com.jpa.entities.TblBibliografia;

@Stateless
public class BibliografiaServicesImpl extends AbstractFacade<TblBibliografia> implements BibliografiaServices {

	@PersistenceContext(name = "unidocentes")
	private EntityManager em;

	public BibliografiaServicesImpl() {
		super(TblBibliografia.class);
		}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
