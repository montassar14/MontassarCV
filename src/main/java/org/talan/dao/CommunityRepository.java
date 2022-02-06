package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Community;

public interface CommunityRepository extends JpaRepository<Community, Long> {

}
