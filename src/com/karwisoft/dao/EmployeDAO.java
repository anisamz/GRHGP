package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface EmployeDAO {
	public void save(Employe a);
	public void delete(Employe a);
	public void update(Employe a);
	public Employe findById(int id_Employe);
	public List<Employe>findByAll();

}
