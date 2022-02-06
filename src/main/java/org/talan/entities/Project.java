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
public class Project implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProject;
	private String nameProject;
	//@OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
	private String tools;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(Long idProject, String nameProject, String tools) {
		super();
		this.idProject = idProject;
		this.nameProject = nameProject;
		this.tools = tools;
	}
	public Long getIdProject() {
		return idProject;
	}
	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	

}
