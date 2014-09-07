package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface TacheDAO {
	public void save(Tache a);
	public void delete(Tache a);
	public void update(Tache a);
	public Tache findById(int id_Tache);
	public List<Tache>findByAll();

}
