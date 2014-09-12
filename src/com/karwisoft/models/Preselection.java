package com.karwisoft.models;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;




@Entity
@Table(name = "preselection")

public class Preselection  {
	private Integer idPreselection;
	public String note;
	private Offre offre;
	private Set<Candidat> candidats=new HashSet<Candidat>();
	public Preselection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idPreselection")
	
	public Integer getIdPreselection() {
		return idPreselection;
	}

	public void setIdPreselection(Integer idPreselection) {
		this.idPreselection = idPreselection;
	}
	
	@Column(name = "note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
	@OneToOne
	@JoinColumn(name="idOffre")
	public Offre getOffre() {
		return offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}



	@OneToMany(mappedBy="p" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	public Set<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(Set<Candidat> candidats) {
		this.candidats = candidats;
	}


	
	
	
	
	
	
	

}
