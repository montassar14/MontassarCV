package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Skill;
import org.talan.metier.SkillMetier;

@RestController
@CrossOrigin("*")
public class SkillRestService {
	
	@Autowired
	private SkillMetier skillMetier;

	@RequestMapping(value = "/skills", method=RequestMethod.POST)
	public Skill saveSkill(@RequestBody Skill s) {
		return skillMetier.saveSkill(s);
	}

	@RequestMapping(value = "/skills", method=RequestMethod.GET)
	public List<Skill> listSkill() {
		return skillMetier.listSkill();
	}
	

}
