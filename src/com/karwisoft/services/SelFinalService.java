package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.SelFinal;



public class SelFinalService {
	
	
private SelFinalDAO SelFinalDAO ;

public SelFinalDAO getSelFinalDAO() {
	return SelFinalDAO;
}

@Autowired

public void setSelFinalDAO(SelFinalDAO SelFinalDAO) {
	this.SelFinalDAO = SelFinalDAO;
}

public void enregistrerSelFinal(SelFinal a){
	SelFinalDAO.save(a);
}

public void supprimerSelFinal(SelFinal a){
	SelFinalDAO.delete(a);
}

public void mettreAJourSelFinal(SelFinal a){
	SelFinalDAO.update(a);
}


public SelFinal rechercherSelFinal(int id_SelFinal){
	return SelFinalDAO.findById(id_SelFinal);
}

public List<SelFinal> rechercherTous(){
	return SelFinalDAO.findByAll();
}

}
