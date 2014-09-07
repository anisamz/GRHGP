package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Admin;



public class AdminService {
	
	
private AdminDAO adminDAO ;

public AdminDAO getAdminDAO() {
	return adminDAO;
}

@Autowired

public void setAdminDAO(AdminDAO adminDAO) {
	this.adminDAO = adminDAO;
}

public void enregistrerAdmin(Admin a){
	adminDAO.save(a);
}

public void supprimerAdmin(Admin a){
	adminDAO.delete(a);
}

public void mettreAJourAdmin(Admin a){
	adminDAO.update(a);
}


public Admin rechercherAdmin(int id_Admin){
	return adminDAO.findById(id_Admin);
}

public List<Admin> rechercherTous(){
	return adminDAO.findByAll();
}

}
