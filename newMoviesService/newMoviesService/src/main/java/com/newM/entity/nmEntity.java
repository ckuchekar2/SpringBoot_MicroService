package com.newM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class nmEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nmId;
	
	private String nmname;
	
	private Double starRating;
	
	private String img;
	
	public nmEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public nmEntity(int nmId, String nmname, Double starRating, String img) {
		super();
		this.nmId = nmId;
		this.nmname = nmname;
		this.starRating = starRating;
		this.img = img;
	}


	public int getNmId() {
		return nmId;
	}

	public void setNmId(int nmId) {
		this.nmId = nmId;
	}

	public String getNmname() {
		return nmname;
	}

	public void setNmname(String nmname) {
		this.nmname = nmname;
	}

	public Double getStarRating() {
		return starRating;
	}

	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
