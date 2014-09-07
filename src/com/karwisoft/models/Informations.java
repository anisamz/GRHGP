package com.karwisoft.models;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "informations")

public class Informations  {
	
	private Employe employe;
	private Integer id_inf;
	public String nom;
	public String prenom;
	public Date date_nai;	
	public Integer cin ;
	public String adress;
	public Integer codeP;
	public String pays;
	public Float salaire;
	public String specialite;
	public Date dateEntree;


	public Informations() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Informations(Integer id_inf, String nom, String prenom,
			Date date_nai, Integer cin, String adress, Integer codeP,
			String pays, Float salaire, String specialite, Date dateEntree) {
		super();
		this.id_inf = id_inf;
		this.nom = nom;
		this.prenom = prenom;
		this.date_nai = date_nai;
		this.cin = cin;
		this.adress = adress;
		this.codeP = codeP;
		this.pays = pays;
		this.salaire = salaire;
		this.specialite = specialite;
		this.dateEntree = dateEntree;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_inf")
 	

	public Integer getId_inf() {
		return id_inf;
	}


	public void setId_inf(Integer id_inf) {
		this.id_inf = id_inf;
	}

	@Column(name = "nom")
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom")
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "date_Naissance")
	public Date getDate_nai() {
		return date_nai;
	}


	public void setDate_nai(Date date_nai) {
		this.date_nai = date_nai;
	}

	@Column(name = "CIN")
	public Integer getCin() {
		return cin;
	}


	public void setCin(Integer cin) {
		this.cin = cin;
	}

	@Column(name = "adress")
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "code_postale")
	public Integer getCodeP() {
		return codeP;
	}

	public void setCodeP(Integer codeP) {
		this.codeP = codeP;
	}

	@Column(name = "pays")
	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}

	@Column(name = "salaire")
	public Float getSalaire() {
		return salaire;
	}


	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}

	@Column(name = "specialite")
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Column(name = "dateEntree")
	public Date getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}


	
	@OneToOne
	@JoinColumn(name="idEmploye")
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	

}
