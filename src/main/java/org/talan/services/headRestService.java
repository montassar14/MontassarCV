package org.talan.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.head;
import org.talan.metier.headMetier;

@RestController
@CrossOrigin("*")
public class headRestService {
	
	@Autowired
	private headMetier headMet;

	@RequestMapping(value = "/heads", method=RequestMethod.POST)
	public head saveHead(@RequestBody head h) {
		return headMet.saveHead(h);
	}

	@RequestMapping(value = "/heads", method=RequestMethod.GET)
	public List<head> listHead() {
		return headMet.listHead();
	}
	
	@RequestMapping(value = "/heads/{l}",method=RequestMethod.GET)
	public head getCompte(@PathVariable Long l) {
			return headMet.getHead(l);
	}

}
