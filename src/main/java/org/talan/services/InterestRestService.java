package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Interest;
import org.talan.metier.InterestMetier;

@RestController
@CrossOrigin("*")
public class InterestRestService {
	
	@Autowired
	private InterestMetier interestMetier;

	@RequestMapping(value = "/interests", method=RequestMethod.POST)
	public Interest saveInterest(@RequestBody Interest i) {
		return interestMetier.saveInterest(i);
	}

	@RequestMapping(value = "/interests", method=RequestMethod.GET)
	public List<Interest> listInterest() {
		return interestMetier.listInterest();
	}
	

}
