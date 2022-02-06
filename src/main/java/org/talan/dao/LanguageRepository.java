package org.talan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.talan.entities.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {

}
