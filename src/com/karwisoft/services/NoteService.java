package com.karwisoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.karwisoft.dao.*;
import com.karwisoft.models.Note;



public class NoteService {
	
	
private NoteDAO NoteDAO ;

public NoteDAO getNoteDAO() {
	return NoteDAO;
}

@Autowired

public void setNoteDAO(NoteDAO NoteDAO) {
	this.NoteDAO = NoteDAO;
}

public void enregistrerNote(Note a){
	NoteDAO.save(a);
}

public void supprimerNote(Note a){
	NoteDAO.delete(a);
}

public void mettreAJourNote(Note a){
	NoteDAO.update(a);
}


public Note rechercherNote(int id_Note){
	return NoteDAO.findById(id_Note);
}

public List<Note> rechercherTous(){
	return NoteDAO.findByAll();
}

}
