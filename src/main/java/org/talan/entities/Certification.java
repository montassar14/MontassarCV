package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certification implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertification;
	private String nameCertification;
	private String sourceCertification;
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certification(Long idCertification, String nameCertification, String sourceCertification) {
		super();
		this.idCertification = idCertification;
		this.nameCertification = nameCertification;
		this.sourceCertification = sourceCertification;
	}
	public Long getIdCertification() {
		return idCertification;
	}
	public void setIdCertification(Long idCertification) {
		this.idCertification = idCertification;
	}
	public String getNameCertification() {
		return nameCertification;
	}
	public void setNameCertification(String nameCertification) {
		this.nameCertification = nameCertification;
	}
	public String getSourceCertification() {
		return sourceCertification;
	}
	public void setSourceCertification(String sourceCertification) {
		this.sourceCertification = sourceCertification;
	}
	

}
