package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Informations;



public class InformationsService {
	
	
private InformationsDAO InformationsDAO ;

public InformationsDAO getInformationsDAO() {
	return InformationsDAO;
}

@Autowired

public void setInformationsDAO(InformationsDAO InformationsDAO) {
	this.InformationsDAO = InformationsDAO;
}

public void enregistrerInformations(Informations a){
	InformationsDAO.save(a);
}

public void supprimerInformations(Informations a){
	InformationsDAO.delete(a);
}

public void mettreAJourInformations(Informations a){
	InformationsDAO.update(a);
}


public Informations rechercherInformations(int id_Informations){
	return InformationsDAO.findById(id_Informations);
}

public List<Informations> rechercherTous(){
	return InformationsDAO.findByAll();
}

}
