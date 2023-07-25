package com.sirion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirion.entity.Employee;
import com.sirion.repo.EmployeeRepo;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class EmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmployee() {		
		return repo.findAll();
	}

	@Override
	public void addEmployee(Employee e) {
		if(e!=null && e.getName().length()>3) {
			repo.saveAndFlush(e);
			System.out.println("Employee Created..");
		}
			
	}

	@Override
	public Employee getEmployee(int empid) {
		Employee op= repo.getReferenceById(empid);
		/*
		 * if(op.isPresent()) return op.get(); else return null;
		 */
		return op;
	}

}
