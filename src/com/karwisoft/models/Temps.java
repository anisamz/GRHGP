package com.karwisoft.models;




import java.io.File;

import javax.persistence.*;

import org.primefaces.model.UploadedFile;


@Entity
@Table(name = "temps")

public class Temps  {
	
	private Employe employe;
	private Integer idTemps;
	public File doc;
	
	public Temps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Temps(Integer temps_id, File doc) {
		super();
		this.idTemps = temps_id;
		this.doc = doc;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idTemps")
	public Integer getIdTemps() {
		return idTemps;
	}
	public void setIdTemps(Integer idTemps) {
		this.idTemps = idTemps;
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
