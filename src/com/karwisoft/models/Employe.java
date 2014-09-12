package com.karwisoft.models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "employe")

public class Employe  {
	
	private Integer idEmploye;
	private String id_karwisoft;
	public String nom;
	private String mail;
	private String tel;
	private String employe_pwd;
	private Boolean responsable;
	private Set<Tache> taches=new HashSet<Tache>();
	private Informations informations;
	private Set<Formation> Formation =new HashSet<Formation>();
	private Set<Projet> projet =new HashSet<Projet>();
	private Contrat contrat;
	private Set<Demande> demandes=new HashSet<Demande>();
	private Set<Note> notes=new HashSet<Note>();
	private Depense depense;
	private Temps temps;
	


	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employe(Integer id, String id_karwisoft, String nom, String mail,
			String tel, String employe_pwd) {
		super();
		this.idEmploye = id;
		this.id_karwisoft = id_karwisoft;
		this.nom = nom;
		this.mail = mail;
		this.tel = tel;
		this.employe_pwd = employe_pwd;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idEmploye")
	public Integer getId() {
		return idEmploye;
	}

	public void setId(Integer id) {
		this.idEmploye = id;
	}

	
	@Column(name = "id_karwisoft")
	public String getId_karwisoft() {
		return id_karwisoft;
	}

	public void setId_karwisoft(String id_karwisoft) {
		this.id_karwisoft = id_karwisoft;
	}

	@Column(name = "nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name = "responsable")
	public Boolean getResponsable() {
		return responsable;
	}


	public void setResponsable(Boolean responsable) {
		this.responsable = responsable;
	}
	
	@Column(name = "mail")
	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "employe_pwd")
	public String getEmploye_pwd() {
		return employe_pwd;
	}
	public void setEmploye_pwd(String employe_pwd) {
		this.employe_pwd = employe_pwd;
	}
	
	@Column(name = "tel")
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@OneToMany(mappedBy="e" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	
	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@OneToOne(mappedBy="employe")
	public Informations getInformations() {
		return informations;
	}


	public void setInformations(Informations informations) {
		this.informations = informations;
	}



	@ManyToMany
	@JoinTable( name="employe_formation", joinColumns={@JoinColumn(name="idEmploye")}, inverseJoinColumns={@JoinColumn(name="idFormation")}
	)
	
	public Set<Formation> getFormation() {
		return Formation;
	}

	public void setFormation(Set<Formation> formation) {
		Formation = formation;
	}

	@OneToOne(mappedBy="employe")

	public Contrat getContrat() {
		return contrat;
	}


	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}


	
	
	@OneToMany(mappedBy="e" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	public Set<Demande> getDemandes() {
		return demandes;
	}


	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}


	@OneToOne(mappedBy="employe")
	public Depense getDepense() {
		return depense;
	}
	public void setDepense(Depense depense) {
		this.depense = depense;
	}


	@OneToMany(mappedBy="e" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	public Set<Note> getNotes() {
		return notes;
	}
	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}
	
	@OneToOne(mappedBy="employe")

	public Temps getTemps() {
		return temps;
	}

	public void setTemps(Temps temps) {
		this.temps = temps;
	}




	@ManyToMany
	@JoinTable( name="employe_projet", joinColumns={@JoinColumn(name="idEmploye")}, inverseJoinColumns={@JoinColumn(name="idProjet")}
	)
	public Set<Projet> getProjet() {
		return projet;
	}


	public void setProjet(Set<Projet> projets) {
		this.projet = projet;
	}
	
}
