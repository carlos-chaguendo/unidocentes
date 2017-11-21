package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblUnidadmicrocur;;

public interface UnidadMicroCurServices {
	public void create(TblUnidadmicrocur unidadMicro);

	public void edit(TblUnidadmicrocur unidadMicro);

	public void remove(TblUnidadmicrocur unidadMicro);

	public TblUnidadmicrocur find(Object idUnidadMicrocurr);

	public List<TblUnidadmicrocur> findAll();
}
