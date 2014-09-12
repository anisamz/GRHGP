package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Document;



public class DocumentService {
	
	
private DocumentDAO DocumentDAO ;

public DocumentDAO getDocumentDAO() {
	return DocumentDAO;
}

@Autowired

public void setDocumentDAO(DocumentDAO DocumentDAO) {
	this.DocumentDAO = DocumentDAO;
}

public void enregistrerDocument(Document a){
	DocumentDAO.save(a);
}

public void supprimerDocument(Document a){
	DocumentDAO.delete(a);
}

public void mettreAJourDocument(Document a){
	DocumentDAO.update(a);
}


public Document rechercherDocument(int id_Document){
	return DocumentDAO.findById(id_Document);
}

public List<Document> rechercherTous(){
	return DocumentDAO.findByAll();
}

}
