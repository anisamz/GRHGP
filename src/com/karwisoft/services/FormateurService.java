package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Formateur;



public class FormateurService {
	
	
private FormateurDAO FormateurDAO ;

public FormateurDAO getFormateurDAO() {
	return FormateurDAO;
}

@Autowired

public void setFormateurDAO(FormateurDAO FormateurDAO) {
	this.FormateurDAO = FormateurDAO;
}

public void enregistrerFormateur(Formateur a){
	FormateurDAO.save(a);
}

public void supprimerFormateur(Formateur a){
	FormateurDAO.delete(a);
}

public void mettreAJourFormateur(Formateur a){
	FormateurDAO.update(a);
}


public Formateur rechercherFormateur(int id_Formateur){
	return FormateurDAO.findById(id_Formateur);
}

public List<Formateur> rechercherTous(){
	return FormateurDAO.findByAll();
}

}
