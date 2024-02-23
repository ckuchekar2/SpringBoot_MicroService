package com.newM.controller;

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

//import com.classicM.entity.classicM;
import com.newM.entity.nmEntity;
import com.newM.serIMPL.nmServiceImpl;
import com.newM.service.nmService;

import jakarta.ws.rs.Path;

@RestController
@RequestMapping("/nm")
public class nmController {

	@Autowired
	nmService nmSer;
	
	@Autowired
	nmServiceImpl nmImpl;
	
	@PostMapping
	public nmEntity add(@RequestBody nmEntity ne) {
		return nmSer.add(ne);
	}
	
	@GetMapping
	public List<nmEntity> getAll(){
		return nmSer.getAll();
	}
	
	@GetMapping("/{nmId}")
	public nmEntity getById(@PathVariable int nmId) {
		return nmSer.getOne(nmId);
	}
	
	@PutMapping("/{nmId}")
	public nmEntity update(@RequestBody nmEntity cl,@PathVariable int nmId ) {
		return nmImpl.update(nmId, cl);
	}
	
	@DeleteMapping("/{nmId}")
	public void delete(@PathVariable int nmId) {
		nmImpl.delete(nmId);
	}
}
