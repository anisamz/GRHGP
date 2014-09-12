package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface OffreDAO {
	public void save(Offre a);
	public void delete(Offre a);
	public void update(Offre a);
	public Offre findById(int id_Offre);
	public List<Offre>findByAll();

}
