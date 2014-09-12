package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface FormationDAO {
	public void save(Formation a);
	public void delete(Formation a);
	public void update(Formation a);
	public Formation findById(int id_Formation);
	public List<Formation>findByAll();

}
