package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Tache;



public class TacheService {
	
	
private TacheDAO TacheDAO ;

public TacheDAO getTacheDAO() {
	return TacheDAO;
}

@Autowired

public void setTacheDAO(TacheDAO TacheDAO) {
	this.TacheDAO = TacheDAO;
}

public void enregistrerTache(Tache a){
	TacheDAO.save(a);
}

public void supprimerTache(Tache a){
	TacheDAO.delete(a);
}

public void mettreAJourTache(Tache a){
	TacheDAO.update(a);
}


public Tache rechercherTache(int id_Tache){
	return TacheDAO.findById(id_Tache);
}

public List<Tache> rechercherTous(){
	return TacheDAO.findByAll();
}

}
