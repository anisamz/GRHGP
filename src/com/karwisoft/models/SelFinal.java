package com.karwisoft.models;




import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "selFinal")

public class SelFinal  {
	private Integer idSelfinal;
	public String note;
	private Offre offre;
	private Set<Candidat> candidats=new HashSet<Candidat>();
	

	public SelFinal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SelFinal(Integer id_selfinal, String note) {
		super();
		this.idSelfinal = id_selfinal;
		this.note = note;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idSelfinal")
	public Integer getIdSelfinal() {
		return idSelfinal;
	}

	public void setIdSelfinal(Integer idSelfinal) {
		this.idSelfinal = idSelfinal;
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

	
	@OneToMany(mappedBy="f" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	public Set<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(Set<Candidat> candidats) {
		this.candidats = candidats;
	}
	
	
	
	
	

}
