package org.talan.metier;

import java.util.List;

import org.talan.entities.Language;

public interface LanguageMetier {
	
	public Language saveLanguage(Language l);
	public List<Language> listLanguage();

}
