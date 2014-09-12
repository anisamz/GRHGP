package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface SelFinalDAO {
	public void save(SelFinal a);
	public void delete(SelFinal a);
	public void update(SelFinal a);
	public SelFinal findById(int id_SelFinal);
	public List<SelFinal>findByAll();

}
