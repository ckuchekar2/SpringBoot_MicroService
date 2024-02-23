package com.classicM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classicM.entity.classicM;
import com.classicM.serImpl.serviceImpl;
import com.classicM.service.CMserviceInterface;

@RestController
@RequestMapping("/cm")
public class cmController {
	
	@Autowired
	CMserviceInterface cmInterface;
	
	@Autowired
	serviceImpl serimpl;
	
	@PostMapping
	public classicM create(@RequestBody classicM cl) {
		return cmInterface.add(cl);
	}
	
	@GetMapping
	public List<classicM> getall(){
		return cmInterface.getAll();
	}
	
	@GetMapping("/{id}")
	public classicM getOne(@PathVariable int id) {
		return cmInterface.get(id);
	}
	
	
	@PutMapping("/{id}")
	public classicM update(@RequestBody classicM cl,@PathVariable int id ) {
		return serimpl.update(id, cl);
	}
	
	@DeleteMapping("/{id}")
	public void  delete(@PathVariable int id) {
		serimpl.delete(id);
	}
}
