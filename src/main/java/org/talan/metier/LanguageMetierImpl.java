package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.LanguageRepository;
import org.talan.entities.Language;

@Service
public class LanguageMetierImpl implements LanguageMetier {
	
	@Autowired
	private LanguageRepository languageRepository;

	@Override
	public Language saveLanguage(Language l) {
		// TODO Auto-generated method stub
		return languageRepository.save(l);
	}

	@Override
	public List<Language> listLanguage() {
		// TODO Auto-generated method stub
		return languageRepository.findAll();
	}

}
