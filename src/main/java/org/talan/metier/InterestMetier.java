package org.talan.metier;

import java.util.List;

import org.talan.entities.Interest;

public interface InterestMetier {
	
	public Interest saveInterest(Interest i);
	public List<Interest> listInterest();

}
