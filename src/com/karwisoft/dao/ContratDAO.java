package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface ContratDAO {
	public void save(Contrat a);
	public void delete(Contrat a);
	public void update(Contrat a);
	public Contrat findById(int id_Contrat);
	public List<Contrat>findByAll();

}
