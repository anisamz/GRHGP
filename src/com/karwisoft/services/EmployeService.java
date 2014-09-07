package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Employe;



public class EmployeService {
	
	
private EmployeDAO EmployeDAO ;

public EmployeDAO getEmployeDAO() {
	return EmployeDAO;
}

@Autowired

public void setEmployeDAO(EmployeDAO EmployeDAO) {
	this.EmployeDAO = EmployeDAO;
}

public void enregistrerEmploye(Employe a){
	EmployeDAO.save(a);
}

public void supprimerEmploye(Employe a){
	EmployeDAO.delete(a);
}

public void mettreAJourEmploye(Employe a){
	EmployeDAO.update(a);
}


public Employe rechercherEmploye(int id_Employe){
	return EmployeDAO.findById(id_Employe);
}

public List<Employe> rechercherTous(){
	return EmployeDAO.findByAll();
}

}
