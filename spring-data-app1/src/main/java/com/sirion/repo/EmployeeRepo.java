package com.sirion.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sirion.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Employee findByNameAndEmail(String name,String email);
}
