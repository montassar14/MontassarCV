package org.talan.metier;

import java.util.List;

import org.talan.entities.Project;

public interface ProjectMetier {
	
	public Project saveProject(Project p);
	public List<Project> listProject();

}
