package com.karwisoft.models;




import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "offre")

public class Offre  {
	private Integer idOffre;
	public String fonction;
	public String secteur;
	public String salaire;
	public String cantrat;
	public String niveau_poste;
	private Set<Candidat> candidat =new HashSet<Candidat>();
	private SelFinal selFinal;
	private Preselection preselection;
	
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Offre(Integer id_offre, String fonction, String secteur,
			String salaire, String cantrat, String niveau_poste) {
		super();
		this.idOffre = id_offre;
		this.fonction = fonction;
		this.secteur = secteur;
		this.salaire = salaire;
		this.cantrat = cantrat;
		this.niveau_poste = niveau_poste;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idOffre")
	
	public Integer getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(Integer idOffre) {
		this.idOffre = idOffre;
	}

	@Column(name = "fonction")
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	@Column(name = "secteur")
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	@Column(name = "salaire")
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
	
	@Column(name = "cantrat")
	public String getCantrat() {
		return cantrat;
	}
	public void setCantrat(String cantrat) {
		this.cantrat = cantrat;
	}
	
	@Column(name = "niveau_poste")
	public String getNiveau_poste() {
		return niveau_poste;
	}
	public void setNiveau_poste(String niveau_poste) {
		this.niveau_poste = niveau_poste;
	}

	
	@ManyToMany
	@JoinTable( name="offre_candidat", joinColumns={@JoinColumn(name="idOffre")}, inverseJoinColumns={@JoinColumn(name="idCandidat")}
	)
	public Set<Candidat> getCandidat() {
		return candidat;
	}


	public void setCandidat(Set<Candidat> candidat) {
		this.candidat = candidat;
	}


	@OneToOne(mappedBy="offre")

	public SelFinal getSelFinal() {
		return selFinal;
	}


	public void setSelFinal(SelFinal selFinal) {
		this.selFinal = selFinal;
	}


	@OneToOne(mappedBy="offre")
	public Preselection getPreselection() {
		return preselection;
	}
	public void setPreselection(Preselection preselection) {
		this.preselection = preselection;
	}
	

}
