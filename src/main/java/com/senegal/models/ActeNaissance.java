package com.senegal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class ActeNaissance {
	private static final long serialiseVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String prenom;
	private String nom;
	private String nomPere;
	private String nomMere;
	private String dateNaissance;
	private String sexe;

	@OneToOne
	@JoinColumn(name="ETAT_CIVILE_ID")
	private EtatCivil etatCivil;
	
	public ActeNaissance(String prenom, String nom, String nomPere, String nomMere, String dateNaissance, String sexe,
			EtatCivil etatCivil) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.nomPere = nomPere;
		this.nomMere = nomMere;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}

	public ActeNaissance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomPere() {
		return nomPere;
	}

	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}

	public String getNomMere() {
		return nomMere;
	}

	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public EtatCivil getEtatCivil() {
		return etatCivil;
	}

	public void setEtatCivil(EtatCivil etatCivil) {
		this.etatCivil = etatCivil;
	}
	
	
	
	
	
}
