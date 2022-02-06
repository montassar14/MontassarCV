package org.talan.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Intern implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIntern;
	private String nameIntern;
	private String company;
	private String descriptionIntern;
	private String technologies;
	//@OneToMany(mappedBy = "intern" , fetch = FetchType.LAZY)
	//private Collection<Skill> technologies;
	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intern(Long idIntern, String nameIntern, String company, String descriptionIntern, String technologies) {
		super();
		this.idIntern = idIntern;
		this.nameIntern = nameIntern;
		this.company = company;
		this.descriptionIntern = descriptionIntern;
		this.technologies = technologies;
	}
	public Long getIdIntern() {
		return idIntern;
	}
	public void setIdIntern(Long idIntern) {
		this.idIntern = idIntern;
	}
	public String getNameIntern() {
		return nameIntern;
	}
	public void setNameIntern(String nameIntern) {
		this.nameIntern = nameIntern;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDescriptionIntern() {
		return descriptionIntern;
	}
	public void setDescriptionIntern(String descriptionIntern) {
		this.descriptionIntern = descriptionIntern;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	

}
