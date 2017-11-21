package com.ejb.services;

import java.util.List;

import com.jpa.entities.TblTemasmicrocur;

public interface TemasMicroCurServices {
	public void create(TblTemasmicrocur temasMicro);

	public void edit(TblTemasmicrocur temasMicro);

	public void remove(TblTemasmicrocur temasMicro);

	public TblTemasmicrocur find(Object idTemasMicrocur);

	public List<TblTemasmicrocur> findAll();
}
