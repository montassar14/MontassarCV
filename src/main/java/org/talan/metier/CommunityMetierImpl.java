package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.CommunityRepository;
import org.talan.entities.Community;

@Service
public class CommunityMetierImpl implements CommunityMetier {
	
	@Autowired
	public CommunityRepository communityRepository;

	@Override
	public Community saveCommunity(Community c) {
		// TODO Auto-generated method stub
		return communityRepository.save(c);
	}

	@Override
	public List<Community> listCommunity() {
		// TODO Auto-generated method stub
		return communityRepository.findAll();
	}

}
