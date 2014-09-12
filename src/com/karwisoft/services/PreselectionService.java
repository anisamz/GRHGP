package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Preselection;



public class PreselectionService {
	
	
private PreselectionDAO PreselectionDAO ;

public PreselectionDAO getPreselectionDAO() {
	return PreselectionDAO;
}

@Autowired

public void setPreselectionDAO(PreselectionDAO PreselectionDAO) {
	this.PreselectionDAO = PreselectionDAO;
}

public void enregistrerPreselection(Preselection a){
	PreselectionDAO.save(a);
}

public void supprimerPreselection(Preselection a){
	PreselectionDAO.delete(a);
}

public void mettreAJourPreselection(Preselection a){
	PreselectionDAO.update(a);
}


public Preselection rechercherPreselection(int id_Preselection){
	return PreselectionDAO.findById(id_Preselection);
}

public List<Preselection> rechercherTous(){
	return PreselectionDAO.findByAll();
}

}
