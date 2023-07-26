package com.sirion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirion.entity.DL;

public interface DLRepo extends JpaRepository<DL, String> {
	
}
