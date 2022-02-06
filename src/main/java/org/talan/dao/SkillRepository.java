package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
