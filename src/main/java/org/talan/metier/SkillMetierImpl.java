package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.SkillRepository;
import org.talan.entities.Skill;

@Service
public class SkillMetierImpl implements SkillMetier {
	
	@Autowired
	private SkillRepository skillRepository;

	@Override
	public Skill saveSkill(Skill s) {
		// TODO Auto-generated method stub
		return skillRepository.save(s);
	}

	@Override
	public List<Skill> listSkill() {
		// TODO Auto-generated method stub
		return skillRepository.findAll();
	}

}
