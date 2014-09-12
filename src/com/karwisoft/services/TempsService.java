package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Temps;



public class TempsService {
	
	
private TempsDAO TempsDAO ;

public TempsDAO getTempsDAO() {
	return TempsDAO;
}

@Autowired

public void setTempsDAO(TempsDAO TempsDAO) {
	this.TempsDAO = TempsDAO;
}

public void enregistrerTemps(Temps a){
	TempsDAO.save(a);
}

public void supprimerTemps(Temps a){
	TempsDAO.delete(a);
}

public void mettreAJourTemps(Temps a){
	TempsDAO.update(a);
}


public Temps rechercherTemps(int id_Temps){
	return TempsDAO.findById(id_Temps);
}

public List<Temps> rechercherTous(){
	return TempsDAO.findByAll();
}

}
