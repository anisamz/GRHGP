package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface DepenseDAO {
	public void save(Depense a);
	public void delete(Depense a);
	public void update(Depense a);
	public Depense findById(int id_Depense);
	public List<Depense>findByAll();

}
