package com.karwisoft.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "tache")

public class Tache  {
	private String nom;
	
	private Integer idTache;
	private String description;
	private Projet p;
	private Employe e;
	private Depense d;
	private Set<Document> documents=new HashSet<Document>();
	private String dateD;
	private String dateF;

	
	
	
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tache(Integer id, String nom, String description) {
		super();
		this.idTache = id;
		this.nom = nom;
		this.description = description;
	}


	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tache")
	public Integer getId() {
		return idTache;
	}
	public void setId(Integer id) {
		this.idTache = id;
	}

	@Column(name = "nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	@Column(name = "dateD")
	public String getDateD() {
		return dateD;
	}
    public void setDateD(String dateD) {
		this.dateD = dateD;
	}
	
	@Column(name = "dateF")
	public String getDateF() {
		return dateF;
	}
	public void setDateF(String dateF) {
		this.dateF = dateF;
	}
	
	
	@ManyToOne(targetEntity=com.karwisoft.models.Projet.class)
	@JoinColumn(name="idProjet")
	public Projet getP() {
		return p;
	}
	

	public void setP(Projet p) {
		this.p = p;
	}

	@ManyToOne(targetEntity=com.karwisoft.models.Employe.class)
	@JoinColumn(name="idEmploye")

	public Employe getE() {
		return e;
	}

	public void setE(Employe e) {
		this.e = e;
	}

	
	@OneToMany(mappedBy="doc" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}



	@ManyToOne(targetEntity=com.karwisoft.models.Depense.class)
	@JoinColumn(name="idDepense")
	public Depense getD() {
		return d;
	}

	public void setD(Depense d) {
		this.d = d;
	}

	



	

}
