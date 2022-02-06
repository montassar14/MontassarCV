package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.ProjectRepository;
import org.talan.entities.Project;

@Service
public class ProjectMetierImpl implements ProjectMetier {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project p) {
		// TODO Auto-generated method stub
		return projectRepository.save(p);
	}

	@Override
	public List<Project> listProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

}
