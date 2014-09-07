package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Projet;



public class ProjetService {
	
	
private ProjetDAO ProjetDAO ;

public ProjetDAO getProjetDAO() {
	return ProjetDAO;
}

@Autowired

public void setProjetDAO(ProjetDAO ProjetDAO) {
	this.ProjetDAO = ProjetDAO;
}

public void enregistrerProjet(Projet a){
	ProjetDAO.save(a);
}

public void supprimerProjet(Projet a){
	ProjetDAO.delete(a);
}

public void mettreAJourProjet(Projet a){
	ProjetDAO.update(a);
}


public Projet rechercherProjet(int id_Projet){
	return ProjetDAO.findById(id_Projet);
}

public List<Projet> rechercherTous(){
	return ProjetDAO.findByAll();
}

}
