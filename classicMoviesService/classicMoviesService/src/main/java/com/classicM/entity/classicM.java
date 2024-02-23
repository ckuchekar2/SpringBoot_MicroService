package com.classicM.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class classicM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String CMname;
	private Double starR;
	private String img;
	public classicM() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public classicM(int id, String cMname, Double starR, String img) {
		super();
		this.id = id;
		CMname = cMname;
		this.starR = starR;
		this.img = img;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCMname() {
		return CMname;
	}
	public void setCMname(String cMname) {
		CMname = cMname;
	}
	public Double getStarR() {
		return starR;
	}
	public void setStarR(Double starR) {
		this.starR = starR;
	}
	

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
