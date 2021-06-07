package com.senegal.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EtatCivil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long EtatCivilId;
	private String localite;
	private String departement;
	private String region;
	
	@OneToMany
    private Collection<ActeNaissance> allActeNaissance ;

	public EtatCivil(String localite, String departement, String region) {
		super();
		this.localite = localite;
		this.departement = departement;
		this.region = region;
	}

	public EtatCivil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getEtatCivilId() {
		return EtatCivilId;
	}

	public void setEtatCivilId(long etatCivilId) {
		EtatCivilId = etatCivilId;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Collection<ActeNaissance> getAllActeNaissance() {
		return allActeNaissance;
	}

	public void setAllActeNaissance(Collection<ActeNaissance> allActeNaissance) {
		this.allActeNaissance = allActeNaissance;
	}
	
	
}
