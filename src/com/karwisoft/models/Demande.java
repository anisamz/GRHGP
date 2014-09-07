package com.karwisoft.models;




import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "demande")

public class Demande  {
	
	private Employe e;
	private Integer idDemande;
	private String type;
	public Date dateD;
	public Date dateF;
	public String corp;
	public String periode;
	public Boolean etat;
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demande(Integer idDemande, String type, Date dateD, Date dateF,
			String corp, String periode, Boolean etat) {
		super();
		this.idDemande = idDemande;
		this.type = type;
		this.dateD = dateD;
		this.dateF = dateF;
		this.corp = corp;
		this.periode = periode;
		this.etat = etat;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDemande")
	public Integer getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}
	
	@Column(name = "type")
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	
	
	@Column(name = "DateD")
	public Date getDateD() {
		return dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}
	
	
	@Column(name = "DateF")
	public Date getDateF() {
		return dateF;
	}

	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}

	
	@Column(name = "Corp")
	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	

	@Column(name = "Periode")
	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
	@Column(name = "Etat")
	
	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
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
