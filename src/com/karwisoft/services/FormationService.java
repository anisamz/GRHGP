package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Formation;



public class FormationService {
	
	
private FormationDAO FormationDAO ;

public FormationDAO getFormationDAO() {
	return FormationDAO;
}

@Autowired

public void setFormationDAO(FormationDAO FormationDAO) {
	this.FormationDAO = FormationDAO;
}

public void enregistrerFormation(Formation a){
	FormationDAO.save(a);
}

public void supprimerFormation(Formation a){
	FormationDAO.delete(a);
}

public void mettreAJourFormation(Formation a){
	FormationDAO.update(a);
}


public Formation rechercherFormation(int id_Formation){
	return FormationDAO.findById(id_Formation);
}

public List<Formation> rechercherTous(){
	return FormationDAO.findByAll();
}

}
