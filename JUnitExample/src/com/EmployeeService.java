package com;

import java.util.Iterator;
import java.util.Optional;

public class EmployeeService implements IEmployeService {

	@Override
	public void addEmployee(Employee emp) {
		if (!(emp == null || emp.getName().isEmpty()))
			EmployeeRepository.getEmployeeList().add(emp);

	}

	@Override
	public void removeEmployee(int empid) {
		Iterator<Employee> i = EmployeeRepository.getEmployeeList().iterator();
		while (i.hasNext()) {
			if (i.next().getEmpid() == empid)
				i.remove();
		}

	}

	@Override
	public Employee getEmployee(int empid) {
		Optional<Employee> op=EmployeeRepository.getEmployeeList().stream().filter(e->e.getEmpid()==empid).findFirst();
		if(op.isPresent())
			return op.get();
		else
			return null;
	}

}
