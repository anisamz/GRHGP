package com.karwisoft.dao;

import java.util.List;

import com.karwisoft.models.*;

public interface AdminDAO {
	public void save(Admin a);
	public void delete(Admin a);
	public void update(Admin a);
	public Admin findById(int id_admin);
	public List<Admin>findByAll();

}
