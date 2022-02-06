package org.talan.metier;

import java.util.List;

import org.talan.entities.Intern;

public interface InternMetier {

	public Intern saveIntern(Intern i);
	public List<Intern> listIntern();
}
