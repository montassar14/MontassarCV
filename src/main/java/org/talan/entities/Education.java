package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEducation;
	private String nameEducation;
	private String lieuEducation;
	private String dateDebut;
	private String dateFinish;
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Education(Long idEducation, String nameEducation, String lieuEducation, String dateDebut,
			String dateFinish) {
		super();
		this.idEducation = idEducation;
		this.nameEducation = nameEducation;
		this.lieuEducation = lieuEducation;
		this.dateDebut = dateDebut;
		this.dateFinish = dateFinish;
	}
	public Long getIdEducation() {
		return idEducation;
	}
	public void setIdEducation(Long idEducation) {
		this.idEducation = idEducation;
	}
	public String getNameEducation() {
		return nameEducation;
	}
	public void setNameEducation(String nameEducation) {
		this.nameEducation = nameEducation;
	}
	public String getLieuEducation() {
		return lieuEducation;
	}
	public void setLieuEducation(String lieuEducation) {
		this.lieuEducation = lieuEducation;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFinish() {
		return dateFinish;
	}
	public void setDateFinish(String dateFinish) {
		this.dateFinish = dateFinish;
	}

}
