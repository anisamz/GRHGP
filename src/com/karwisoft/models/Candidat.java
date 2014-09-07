package com.karwisoft.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import java.io.File;

@Entity
@Table(name = "candidat")

public class Candidat  {
	
	private Integer idCandidat;
	public String nom;
	private String pwd;
	private String mail;
	public File cv;
	public File lm;	
	private Set<Offre> offre =new HashSet<Offre>();
	private Preselection p;
	private SelFinal f;
	
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Candidat(Integer id_candidat, String nom, String pwd, String mail,
			File cv, File lm) {
		super();
		this.idCandidat = id_candidat;
		this.nom = nom;
		this.pwd = pwd;
		
		this.mail = mail;
		this.cv = cv;
		this.lm = lm;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCandidat")

	public Integer getIdCandidat() {
		return idCandidat;
	}


	public void setIdCandidat(Integer idCandidat) {
		this.idCandidat = idCandidat;
	}
	
	
	@Column(name = "nom")

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "pwd")

	public String getPwd() {
		return pwd;
	}




	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Column(name = "lm")
	public File getLm() {
		return lm;
	}


	public void setLm(File lm) {
		this.lm = lm;
	}
	
	@Column(name = "mail")
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "cv")
	public File getCv() {
		return cv;
	}

	public void setCv(File cv) {
		this.cv = cv;
	}

	@ManyToMany(mappedBy="candidat")
	public Set<Offre> getOffre() {
		return offre;
	}

	public void setOffre(Set<Offre> offre) {
		this.offre = offre;
	}
	
	@ManyToOne(targetEntity=com.karwisoft.models.SelFinal.class)
	@JoinColumn(name="idSelfinal")

	public SelFinal getF() {
		return f;
	}

	public void setF(SelFinal f) {
		this.f = f;
	}

	@ManyToOne(targetEntity=com.karwisoft.models.Preselection.class)
	@JoinColumn(name="idPreselection")

	public Preselection getP() {
		return p;
	}
	public void setP(Preselection p) {
		this.p = p;
	}
	
	
}
