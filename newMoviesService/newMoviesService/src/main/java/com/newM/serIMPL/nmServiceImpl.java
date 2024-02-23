package com.newM.serIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.newM.entity.nmEntity;
import com.newM.repository.nmRepository;
import com.newM.service.nmService;

@Service
public class nmServiceImpl implements nmService{
	
	@Autowired
	nmRepository nmRepo;

	@Override
	public nmEntity add(nmEntity nm) {
		// TODO Auto-generated method stub
		return nmRepo.save(nm);
	}

	@Override
	public List<nmEntity> getAll() {
		// TODO Auto-generated method stub
		return nmRepo.findAll();
	}

	@Override
	public nmEntity getOne(int nmId) {
		// TODO Auto-generated method stub
		return nmRepo.findById(nmId).orElseThrow(()-> new RuntimeException("SomeThing went wrong..."));
	}

	
	public nmEntity update(int nmId, nmEntity nm) {
		// TODO Auto-generated method stub
		if(nmRepo.existsById(nmId)) {
			nm.setNmId(nmId);
			return nmRepo.save(nm);
		}
		return null;
	}

	public void delete(int nmId) {
		nmRepo.deleteById(nmId);
	}
	
}
