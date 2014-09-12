package com.karwisoft.models;




import javax.persistence.*;


@Entity
@Table(name = "note")

public class Note  {
	private Integer idNote;
	private Employe e;
	private String sujet;
	private String con;
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(Integer id_note, String sujet, String con) {
		super();
		this.idNote = id_note;
		this.sujet = sujet;
		this.con = con;
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idNote")
	public Integer getIdNote() {
		return idNote;
	}
	public void setIdNote(Integer idNote) {
		this.idNote = idNote;
	}
	

	@Column(name = "sujet")
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	
	
	@Column(name = "con")
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}

	

	@ManyToOne(targetEntity=com.karwisoft.models.Employe.class)
	@JoinColumn(name="idEmploye")
	public Employe getE() {
		return e;
	}

	public void setE(Employe e) {
		this.e = e;
	}
	
	
	

	}
	

	
	
	
	
	
	
	


