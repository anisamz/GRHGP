package com.karwisoft.models;

import java.util.HashSet;



import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "projet")

public class Projet  {
	
	private Integer id_projet;
	
	private String discription;
	private String dateD;
	private String dateF;
	private Set<Employe> employe =new HashSet<Employe>();
	
	private Set<Tache> taches=new HashSet<Tache>();
	private Set<Document> documents=new HashSet<Document>();
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projet(Integer id, String discription, String dateD, String dateF) {
		super();
		this.id_projet = id;
		this.discription = discription;
		this.dateD = dateD;
		this.dateF = dateF;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_projet")
	public Integer getId_projet() {
		return id_projet;
	}
	public void setId_projet(Integer id_projet) {
		this.id_projet = id_projet;
	}

	@Column(name = "disciption")
	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
/*	@Column(name = "responsable")
	  public Employe getResponsabe() {
			return responsabe;
		}

		public void setResponsabe(Employe responsabe) {
			this.responsabe = responsabe;
		}*/

	
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


	@OneToMany(mappedBy="p" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	
	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@OneToMany(mappedBy="doc" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

    @ManyToMany(mappedBy="projet")
	
	public Set<Employe> getEmploye() {
		return employe;
	}
	public void setEmploye(Set<Employe> employe) {
		this.employe = employe;
	}
	
	

}
