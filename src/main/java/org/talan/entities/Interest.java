package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interest implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdInterest;
	private String nameInterest;
	public Interest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interest(Long idInterest, String nameInterest) {
		super();
		IdInterest = idInterest;
		this.nameInterest = nameInterest;
	}
	public Long getIdInterest() {
		return IdInterest;
	}
	public void setIdInterest(Long idInterest) {
		IdInterest = idInterest;
	}
	public String getNameInterest() {
		return nameInterest;
	}
	public void setNameInterest(String nameInterest) {
		this.nameInterest = nameInterest;
	}
	

}
