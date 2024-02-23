package com.classicM.service;

import java.util.List;

import com.classicM.entity.classicM;

public interface CMserviceInterface {
	
	classicM add(classicM cm);
	
	List<classicM> getAll();
	
	classicM get(int id);

}
