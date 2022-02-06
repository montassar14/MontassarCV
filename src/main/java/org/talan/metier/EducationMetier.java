package org.talan.metier;

import java.util.List;

import org.talan.entities.Education;

public interface EducationMetier {
	
	public Education saveEducation(Education e);
	public List<Education> listEducation();

}
