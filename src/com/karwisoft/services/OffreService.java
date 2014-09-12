package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Offre;



public class OffreService {
	
	
private OffreDAO OffreDAO ;

public OffreDAO getOffreDAO() {
	return OffreDAO;
}

@Autowired

public void setOffreDAO(OffreDAO OffreDAO) {
	this.OffreDAO = OffreDAO;
}

public void enregistrerOffre(Offre a){
	OffreDAO.save(a);
}

public void supprimerOffre(Offre a){
	OffreDAO.delete(a);
}

public void mettreAJourOffre(Offre a){
	OffreDAO.update(a);
}


public Offre rechercherOffre(int id_Offre){
	return OffreDAO.findById(id_Offre);
}

public List<Offre> rechercherTous(){
	return OffreDAO.findByAll();
}

}
