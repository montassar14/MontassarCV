package org.talan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.talan.entities.Certification;
import org.talan.metier.CertificationMetier;

@RestController
@CrossOrigin("*")
public class CertificationRestService {
	
	@Autowired
	private CertificationMetier certificationMetier;

	@RequestMapping(value = "/certifications", method=RequestMethod.POST)
	public Certification saveCertification(@RequestBody Certification c) {
		return certificationMetier.saveCertification(c);
	}
	
	@RequestMapping(value = "/certifications", method=RequestMethod.GET)
	public List<Certification> listCertification() {
		return certificationMetier.listCertification();
	} 

}
