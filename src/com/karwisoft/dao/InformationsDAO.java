package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface InformationsDAO {
	public void save(Informations a);
	public void delete(Informations a);
	public void update(Informations a);
	public Informations findById(int id_Informations);
	public List<Informations>findByAll();

}
