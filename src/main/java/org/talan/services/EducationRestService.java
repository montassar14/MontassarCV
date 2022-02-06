package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Education;
import org.talan.metier.EducationMetier;

@RestController
@CrossOrigin("*")
public class EducationRestService {
	
	@Autowired
	private EducationMetier educationMetier;

	@RequestMapping(value = "/educations", method=RequestMethod.POST)
	public Education saveEducation(@RequestBody Education e) {
		return educationMetier.saveEducation(e);
	}

	@RequestMapping(value = "/educations", method=RequestMethod.GET)
	public List<Education> listEducation() {
		return educationMetier.listEducation();
	}
	

}
