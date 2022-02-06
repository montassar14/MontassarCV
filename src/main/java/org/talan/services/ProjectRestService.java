package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Project;
import org.talan.metier.ProjectMetier;

@RestController
@CrossOrigin("*")
public class ProjectRestService {
	
	@Autowired
	private ProjectMetier projectMetier;

	@RequestMapping(value = "/projects", method=RequestMethod.POST)
	public Project saveProject(@RequestBody Project p) {
		return projectMetier.saveProject(p);
	}

	@RequestMapping(value = "/projects", method=RequestMethod.GET)
	public List<Project> listProject() {
		return projectMetier.listProject();
	}
	
	

}
