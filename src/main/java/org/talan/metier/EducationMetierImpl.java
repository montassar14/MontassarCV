package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.EducationRepository;
import org.talan.entities.Education;

@Service
public class EducationMetierImpl implements EducationMetier {
	
	@Autowired
	private EducationRepository educationRepository;

	@Override
	public Education saveEducation(Education e) {
		// TODO Auto-generated method stub
		return educationRepository.save(e);
	}

	@Override
	public List<Education> listEducation() {
		// TODO Auto-generated method stub
		return educationRepository.findAll();
	}

}
