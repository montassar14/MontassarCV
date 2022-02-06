package org.talan.metier;

import java.util.List;

import org.talan.entities.Community;

public interface CommunityMetier {
	
	public Community saveCommunity(Community c);
	public List<Community> listCommunity();

}
