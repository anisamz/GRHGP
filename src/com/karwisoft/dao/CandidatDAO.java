package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface CandidatDAO {
	public void save(Candidat a);
	public void delete(Candidat a);
	public void update(Candidat a);
	public Candidat findById(int id_Candidat);
	public List<Candidat>findByAll();

}
