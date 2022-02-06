package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.talan.entities.Certification;


public interface CertificationRepository extends JpaRepository<Certification, Long> {

}
