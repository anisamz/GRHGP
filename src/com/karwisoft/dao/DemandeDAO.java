package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface DemandeDAO {
	public void save(Demande a);
	public void delete(Demande a);
	public void update(Demande a);
	public Demande findById(int id_Demande);
	public List<Demande>findByAll();

}
