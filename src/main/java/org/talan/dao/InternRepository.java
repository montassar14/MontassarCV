package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Intern;

public interface InternRepository extends JpaRepository<Intern, Long> {

}
