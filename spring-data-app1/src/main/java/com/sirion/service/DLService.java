package com.sirion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirion.entity.DL;
import com.sirion.repo.DLRepo;

@Service("dService")
public class DLService {
	@Autowired
	private DLRepo repo;
	public void addDL(DL obj) {
		repo.saveAndFlush(obj);
		System.out.println("DL Created..");
	}
	public DL getDL(String dlNo) {
		Optional<DL> op=repo.findById(dlNo);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
}
