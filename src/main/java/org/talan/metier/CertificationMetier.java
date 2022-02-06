package org.talan.metier;

import java.util.List;

import org.talan.entities.Certification;

public interface CertificationMetier {
	
	public Certification saveCertification(Certification c);
	public List<Certification> listCertification();

}
