package com.classicM.serImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.classicM.entity.classicM;
import com.classicM.repository.classicMrepo;
import com.classicM.service.CMserviceInterface;

@Service
public class serviceImpl implements CMserviceInterface{
	
	@Autowired
	classicMrepo clRepo;

	@Override
	public classicM add(classicM cm) {
		return clRepo.save(cm);
	}

	@Override
	public List<classicM> getAll() {
		return clRepo.findAll();
	}

	@Override
	public classicM get(int id) {
		return clRepo.findById(id).orElseThrow(()->new RuntimeException("Something went wrong."));
	}
	
	public classicM update(int id, classicM cm) {
		if(clRepo.existsById(id))
		{
			cm.getId();
			return clRepo.save(cm);
		}
		return null;
	}
	
	public void delete(int id) {
		clRepo.deleteById(id); 
	}

}
