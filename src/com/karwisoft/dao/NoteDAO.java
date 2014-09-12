package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface NoteDAO {
	public void save(Note a);
	public void delete(Note a);
	public void update(Note a);
	public Note findById(int id_Note);
	public List<Note>findByAll();

}
