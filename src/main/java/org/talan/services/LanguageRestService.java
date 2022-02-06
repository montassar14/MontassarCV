package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Language;
import org.talan.metier.LanguageMetier;

@RestController
@CrossOrigin("*")
public class LanguageRestService {
	
	@Autowired
	private LanguageMetier languageMetier;

	@RequestMapping(value = "/languages", method=RequestMethod.POST)
	public Language saveLanguage(@RequestBody Language l) {
		return languageMetier.saveLanguage(l);
	}

	@RequestMapping(value = "/languages", method=RequestMethod.GET)
	public List<Language> listLanguage() {
		return languageMetier.listLanguage();
	}

}
