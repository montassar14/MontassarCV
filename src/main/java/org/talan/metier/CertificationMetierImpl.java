package org.talan.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talan.dao.CertificationRepository;
import org.talan.entities.Certification;

@Service
public class CertificationMetierImpl implements CertificationMetier {
	
	@Autowired
	private CertificationRepository certificationRepository;

	@Override
	public Certification saveCertification(Certification c) {
		// TODO Auto-generated method stub
		return certificationRepository.save(c);
	}

	@Override
	public List<Certification> listCertification() {
		// TODO Auto-generated method stub
		return certificationRepository.findAll();
	}

}
