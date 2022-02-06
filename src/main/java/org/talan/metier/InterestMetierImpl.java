package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.InterestRepository;
import org.talan.entities.Interest;

@Service
public class InterestMetierImpl implements InterestMetier {
	
	@Autowired
	private InterestRepository interestRepository;

	@Override
	public Interest saveInterest(Interest i) {
		// TODO Auto-generated method stub
		return interestRepository.save(i);
	}

	@Override
	public List<Interest> listInterest() {
		// TODO Auto-generated method stub
		return interestRepository.findAll();
	}
	
	

}
