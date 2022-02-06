package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLanguage;
	private String nameLanguage;
	private String level;
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Language(Long idLanguage, String nameLanguage, String level) {
		super();
		this.idLanguage = idLanguage;
		this.nameLanguage = nameLanguage;
		this.level = level;
	}
	public Long getIdLanguage() {
		return idLanguage;
	}
	public void setIdLanguage(Long idLanguage) {
		this.idLanguage = idLanguage;
	}
	public String getNameLanguage() {
		return nameLanguage;
	}
	public void setNameLanguage(String nameLanguage) {
		this.nameLanguage = nameLanguage;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	

}
