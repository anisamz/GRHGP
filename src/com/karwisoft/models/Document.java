package com.karwisoft.models;
import java.io.File;

import javax.persistence.*;


@Entity
@Table(name = "document")

public class Document  {
	
	private Integer idDoc;
	public File doc;
	private Tache t;
	private Projet p;
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Document(Integer idDoc, File doc) {
		super();
		this.idDoc = idDoc;
		this.doc = doc;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDoc")
	public Integer getIdDoc() {
		return idDoc;
	}


	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	@Column(name = "doc")
	public File getDoc() {
		return doc;
	}
	
	public void setDoc(File doc) {
		this.doc = doc;
	}

	@ManyToOne(targetEntity=com.karwisoft.models.Tache.class)
	@JoinColumn(name="idTache")
	
	public Tache getT() {
		return t;
	}
	public void setT(Tache t) {
		this.t = t;
	}


	@ManyToOne(targetEntity=com.karwisoft.models.Projet.class)
	@JoinColumn(name="idProjet")
	
	public Projet getP() {
		return p;
	}


	public void setP(Projet p) {
		this.p = p;
	}
}
