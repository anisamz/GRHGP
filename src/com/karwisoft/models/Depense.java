package com.karwisoft.models;




import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "depense")

public class Depense  {
	
	private Set<Tache> taches=new HashSet<Tache>();
	private Integer idDepense;
	private Employe employe;
	
	public Depense(Integer id_depense) {
		super();
		this.idDepense = id_depense;
	}
	public Depense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDepense")
	public Integer getIdDepense() {
		return idDepense;
	}

	public void setIdDepense(Integer idDepense) {
		this.idDepense = idDepense;
	}


	@OneToMany(mappedBy="d" ,cascade={CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	
	public Set<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
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
