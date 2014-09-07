package com.karwisoft.models;




import java.io.File;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "contrat")

public class Contrat  {
	
	private Employe employe;
	private Integer idContrat;
	public String nom;
	private String type;
	private Date date;
	private String duree;
	private float salaire;
	public File doc;
	
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contrat(Integer contrat_id, String nom, String type, Date date,
			String duree, float salaire, File doc) {
		super();
		this.idContrat= contrat_id;
		this.nom = nom;
		this.type = type;
		this.date = date;
		this.duree = duree;
		this.salaire = salaire;
		this.doc = doc;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idContrat")

	public Integer getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(Integer contrat_id) {
		this.idContrat = contrat_id;
	}
	
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "duree")
	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	
	@Column(name = "salaire")
	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	@Column(name = "doc")
	public File getDoc() {
		return doc;
	}
	public void setDoc(File doc) {
		this.doc = doc;
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
