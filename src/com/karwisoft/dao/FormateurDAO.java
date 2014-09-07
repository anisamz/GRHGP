package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface FormateurDAO {
	public void save(Formateur a);
	public void delete(Formateur a);
	public void update(Formateur a);
	public Formateur findById(int id_Formateur);
	public List<Formateur>findByAll();

}
