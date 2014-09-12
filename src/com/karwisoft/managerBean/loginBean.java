package com.karwisoft.managerBean;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.karwisoft.models.Admin;
import com.karwisoft.services.*;
@ManagedBean(name="loginBean")
public class loginBean {
	private String username ;
		
	private AdminService adminService;
	
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password ;
	
	public String doLogin ()
	{
		List<Admin> l =adminService.rechercherTous();
		for(Admin i : l)	
			if(i.getAdmin_login().equals(username) && i.getAdmin_pwd().equals(password) )
		return "index_admin.xhtml";		 
		
		return "#";
	}
	

}
