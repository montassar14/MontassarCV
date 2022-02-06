package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Community;
import org.talan.metier.CommunityMetier;

@RestController
@CrossOrigin("*")
public class CommunityRestService {
	
	@Autowired
	private CommunityMetier communityMetier;

	@RequestMapping(value = "/communities", method=RequestMethod.POST)
	public Community saveCommunity(@RequestBody Community c) {
		return communityMetier.saveCommunity(c);
	}

	@RequestMapping(value = "/communities", method=RequestMethod.GET)
	public List<Community> listCommunity() {
		return communityMetier.listCommunity();
	}

}
