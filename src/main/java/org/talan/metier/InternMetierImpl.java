package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.InternRepository;
import org.talan.entities.Intern;

@Service
public class InternMetierImpl implements InternMetier {
	
	@Autowired
	private InternRepository internRepository;

	@Override
	public Intern saveIntern(Intern i) {
		// TODO Auto-generated method stub
		return internRepository.save(i);
	}

	@Override
	public List<Intern> listIntern() {
		// TODO Auto-generated method stub
		return internRepository.findAll();
	}

}
