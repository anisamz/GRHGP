package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Contrat;



public class ContratService {
	
	
private ContratDAO ContratDAO ;

public ContratDAO getContratDAO() {
	return ContratDAO;
}

@Autowired

public void setContratDAO(ContratDAO ContratDAO) {
	this.ContratDAO = ContratDAO;
}

public void enregistrerContrat(Contrat a){
	ContratDAO.save(a);
}

public void supprimerContrat(Contrat a){
	ContratDAO.delete(a);
}

public void mettreAJourContrat(Contrat a){
	ContratDAO.update(a);
}


public Contrat rechercherContrat(int id_Contrat){
	return ContratDAO.findById(id_Contrat);
}

public List<Contrat> rechercherTous(){
	return ContratDAO.findByAll();
}

}
