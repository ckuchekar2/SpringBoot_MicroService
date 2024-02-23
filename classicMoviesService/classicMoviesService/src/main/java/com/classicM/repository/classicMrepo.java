package com.classicM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classicM.entity.classicM;


public interface classicMrepo extends JpaRepository<classicM, Integer>{

}
