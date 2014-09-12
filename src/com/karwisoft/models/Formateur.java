package com.karwisoft.models;




import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "formateur")

public class Formateur  {
	
	private Set<Formation> formations=new HashSet<Formation>();
	private Integer idFormateur;
	public String nom;
	private String mail;
	private String specialite;
	public File cv;
	private String tel;
	
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formateur(Integer id, String nom, String mail, String tel,
			String specialite, File cv) {
		super();
		this.idFormateur = id;
		this.nom = nom;
		this.mail = mail;
		this.tel = tel;
		this.specialite = specialite;
		this.cv = cv;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idFormateur")
	public Integer getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(Integer idFormateur) {
		this.idFormateur = idFormateur;
	}
	
	
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "mail")	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "tel")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Column(name = "specialite")
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Column(name = "cv")
	public File getCv() {
		return cv;
	}

	public void setCv(File cv) {
		this.cv = cv;
	}


	
	
	@OneToMany(mappedBy="f" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	public Set<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}
	
	
	

}
