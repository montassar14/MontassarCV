package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Interest;

public interface InterestRepository extends JpaRepository<Interest, Long> {

}
