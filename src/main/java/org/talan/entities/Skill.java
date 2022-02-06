package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Skill implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSkill;
	private String nameSkill;
	//@ManyToOne
	//@JoinColumn(name="CODE_PROJ")
	//private Project project;
	//@ManyToOne
	//@JoinColumn(name = "CODE_INTERN")
	//private Intern intern;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Long idSkill, String nameSkill) {
		super();
		this.idSkill = idSkill;
		this.nameSkill = nameSkill;
		
	}
	public Long getIdSkill() {
		return idSkill;
	}
	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
	}
	public String getNameSkill() {
		return nameSkill;
	}
	public void setNameSkill(String nameSkill) {
		this.nameSkill = nameSkill;
	}
	/*
	@JsonIgnore
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@JsonIgnore
	public Intern getIntern() {
		return intern;
	}
	public void setIntern(Intern intern) {
		this.intern = intern;
	}
	*/

}
