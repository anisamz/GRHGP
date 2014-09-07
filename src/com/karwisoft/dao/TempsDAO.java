package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface TempsDAO {
	public void save(Temps a);
	public void delete(Temps a);
	public void update(Temps a);
	public Temps findById(int id_Temps);
	public List<Temps>findByAll();

}
