package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface DocumentDAO {
	public void save(Document a);
	public void delete(Document a);
	public void update(Document a);
	public Document findById(int id_Document);
	public List<Document>findByAll();

}
