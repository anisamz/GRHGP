package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Candidat;



public class CandidatService {
	
	
private CandidatDAO CandidatDAO ;

public CandidatDAO getCandidatDAO() {
	return CandidatDAO;
}

@Autowired

public void setCandidatDAO(CandidatDAO CandidatDAO) {
	this.CandidatDAO = CandidatDAO;
}

public void enregistrerCandidat(Candidat a){
	CandidatDAO.save(a);
}

public void supprimerCandidat(Candidat a){
	CandidatDAO.delete(a);
}

public void mettreAJourCandidat(Candidat a){
	CandidatDAO.update(a);
}


public Candidat rechercherCandidat(int id_Candidat){
	return CandidatDAO.findById(id_Candidat);
}

public List<Candidat> rechercherTous(){
	return CandidatDAO.findByAll();
}

}
