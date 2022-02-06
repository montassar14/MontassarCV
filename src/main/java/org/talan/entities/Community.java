package org.talan.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Community implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommunity;
	private String nameCommunity;
	private String roleCommunity;
	public Community() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Community(Long idCommunity, String nameCommunity, String roleCommunity) {
		super();
		this.idCommunity = idCommunity;
		this.nameCommunity = nameCommunity;
		this.roleCommunity = roleCommunity;
	}
	public Long getIdCommunity() {
		return idCommunity;
	}
	public void setIdCommunity(Long idCommunity) {
		this.idCommunity = idCommunity;
	}
	public String getNameCommunity() {
		return nameCommunity;
	}
	public void setNameCommunity(String nameCommunity) {
		this.nameCommunity = nameCommunity;
	}
	public String getRoleCommunity() {
		return roleCommunity;
	}
	public void setRoleCommunity(String roleCommunity) {
		this.roleCommunity = roleCommunity;
	}
	

}
