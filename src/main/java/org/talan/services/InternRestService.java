package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Intern;
import org.talan.metier.InternMetier;

@RestController
@CrossOrigin("*")
public class InternRestService {
	
	@Autowired
	private InternMetier internMetier;

	@RequestMapping(value = "/interns", method=RequestMethod.POST)
	public Intern saveIntern(@RequestBody Intern i) {
		return internMetier.saveIntern(i);
	}

	@RequestMapping(value = "/interns", method=RequestMethod.GET)
	public List<Intern> listIntern() {
		return internMetier.listIntern();
	}
	

}
