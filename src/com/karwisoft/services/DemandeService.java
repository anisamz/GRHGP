package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Demande;



public class DemandeService {
	
	
private DemandeDAO DemandeDAO ;

public DemandeDAO getDemandeDAO() {
	return DemandeDAO;
}

@Autowired

public void setDemandeDAO(DemandeDAO DemandeDAO) {
	this.DemandeDAO = DemandeDAO;
}

public void enregistrerDemande(Demande a){
	DemandeDAO.save(a);
}

public void supprimerDemande(Demande a){
	DemandeDAO.delete(a);
}

public void mettreAJourDemande(Demande a){
	DemandeDAO.update(a);
}


public Demande rechercherDemande(int id_Demande){
	return DemandeDAO.findById(id_Demande);
}

public List<Demande> rechercherTous(){
	return DemandeDAO.findByAll();
}

}
