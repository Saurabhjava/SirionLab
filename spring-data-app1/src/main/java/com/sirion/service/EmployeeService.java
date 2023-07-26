package com.sirion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
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
	public Iterable<Employee> getAllEmployee() {
		Iterable<Employee> i = repo.findAll(Sort.by(Order.desc("name")));
		return i;
	}

	@Override
	public void addEmployee(Employee e) {
		if (e != null && e.getName().length() > 3) {
			repo.save(e);
			System.out.println("Employee Created..");
		}

	}

	@Override
	public Employee getEmployee(int empid) {
		Optional<Employee> op = repo.findById(empid);

		if (op.isPresent())
			return op.get();
		else
			return null;

	}

	@Override
	public Employee getEmployeeByName(String name, String email) {
		Employee li = repo.findByNameAndEmail(name, email);
		return li;
	}

}
