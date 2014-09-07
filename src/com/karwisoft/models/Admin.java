package com.karwisoft.models;




import javax.persistence.*;


@Entity
@Table(name = "admin")

public class Admin  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_id")
	private Integer admin_id;
	
	@Column(name = "nom")
	public String nom;

	@Column(name = "pwd")
	private String pwd;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "type")
	private String type;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Admin(Integer admin_id, String admin_nom, String admin_pwd,
			String admin_login, String type) {
		super();
		this.admin_id = admin_id;
		this.nom = admin_nom;
		this.pwd = admin_pwd;
		this.login = admin_login;
		this.type = type;
	}





	public String getAdmin_login() {
		return login;
	}
	public void setAdmin_login(String admin_login) {
		this.login = admin_login;
	}
	
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_nom() {
		return nom;
	}
	public void setAdmin_nom(String admin_nom) {
		this.nom = admin_nom;
	}
	public String getAdmin_pwd() {
		return pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.pwd = admin_pwd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
