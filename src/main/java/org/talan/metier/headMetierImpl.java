package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.headRepository;
import org.talan.entities.head;

@Service
public class headMetierImpl implements headMetier {

	@Autowired
	private headRepository headRepo;
	@Override
	public head saveHead(head h) {
		// TODO Auto-generated method stub
		return headRepo.save(h);
	}

	@Override
	public List<head> listHead() {
		// TODO Auto-generated method stub
		return headRepo.findAll();
	}

	@Override
	public head getHead(Long l) {
		// TODO Auto-generated method stub
		return headRepo.findById(l).get();
	}

}
