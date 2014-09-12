package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface PreselectionDAO {
	public void save(Preselection a);
	public void delete(Preselection a);
	public void update(Preselection a);
	public Preselection findById(int id_Preselection);
	public List<Preselection>findByAll();

}
