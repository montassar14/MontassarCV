package org.talan.metier;

import java.util.List;

import org.talan.entities.head;

public interface headMetier {
	
	public head saveHead(head h);
	public List<head> listHead();
	public  head getHead(Long l);

}
