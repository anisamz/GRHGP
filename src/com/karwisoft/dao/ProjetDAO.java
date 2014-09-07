package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface ProjetDAO {
	public void save(Projet a);
	public void delete(Projet a);
	public void update(Projet a);
	public Projet findById(int id_Projet);
	public List<Projet>findByAll();

}
