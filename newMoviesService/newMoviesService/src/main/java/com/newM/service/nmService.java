package com.newM.service;

import java.util.List;

import com.newM.entity.nmEntity;

public interface nmService {

	nmEntity add(nmEntity nm);
	
	List<nmEntity> getAll();
	
	nmEntity getOne(int nmId);
	
//	nmEntity update(int nmId, nmEntity nm);
}
