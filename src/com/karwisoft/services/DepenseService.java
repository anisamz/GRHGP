package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Depense;



public class DepenseService {
	
	
private DepenseDAO DepenseDAO ;

public DepenseDAO getDepenseDAO() {
	return DepenseDAO;
}

@Autowired

public void setDepenseDAO(DepenseDAO DepenseDAO) {
	this.DepenseDAO = DepenseDAO;
}

public void enregistrerDepense(Depense a){
	DepenseDAO.save(a);
}

public void supprimerDepense(Depense a){
	DepenseDAO.delete(a);
}

public void mettreAJourDepense(Depense a){
	DepenseDAO.update(a);
}


public Depense rechercherDepense(int id_Depense){
	return DepenseDAO.findById(id_Depense);
}

public List<Depense> rechercherTous(){
	return DepenseDAO.findByAll();
}

}
