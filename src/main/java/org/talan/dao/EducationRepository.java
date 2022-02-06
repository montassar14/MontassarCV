package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
