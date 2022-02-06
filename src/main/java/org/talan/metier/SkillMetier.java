package org.talan.metier;

import java.util.List;

import org.talan.entities.Skill;

public interface SkillMetier {
	
	public Skill saveSkill(Skill s);
	public List<Skill> listSkill();

}
