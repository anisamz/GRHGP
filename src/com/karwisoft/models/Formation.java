package com.karwisoft.models;




import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "formation")

public class Formation  {
	
	private Formateur f;
	private Integer idFormation;
	public String nom;
	public Integer nbHeur;
	private Date dateD;
	private Date dateF;
	private String tech;
	private Float  cout;

	private Set<Employe> employe =new HashSet<Employe>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idFormation")
	public Integer getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(Integer idFormation) {
		this.idFormation = idFormation;
	}

	
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Column(name = "nbHeur")
	public Integer getNbHeur() {
		return nbHeur;
	}
	public void setNbHeur(Integer nbHeur) {
		this.nbHeur = nbHeur;
	}
	
	
	@Column(name = "dateD")
	public Date getDateD() {
		return dateD;
	}
	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}
	
	@Column(name = "dateF")
	public Date getDateF() {
		return dateF;
	}
	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}
	
	
	@Column(name = "techenologie")
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	@Column(name = "formationCout")
	
	public Float getCout() {
		return cout;
	}
	public void setCout(Float cout) {
		this.cout = cout;
	}

	

	@ManyToOne(targetEntity=com.karwisoft.models.Formateur.class)
	@JoinColumn(name="idFormateur")
	public Formateur getF() {
		return f;
	}
	public void setF(Formateur f) {
		this.f = f;
	}

	
	@ManyToMany(mappedBy="formation")
	
	public Set<Employe> getEmploye() {
		return employe;
	}
	public void setEmploye(Set<Employe> employe) {
		this.employe = employe;
	}
	
	

}
