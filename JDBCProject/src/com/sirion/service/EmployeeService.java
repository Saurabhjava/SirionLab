package com.sirion.service;

import com.sirion.bean.Address;
import com.sirion.bean.Employee;
import com.sirion.dao.AddressDao;
import com.sirion.dao.EmployeeDao;
import com.sirion.dao.IAddressDao;
import com.sirion.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IAddressDao adao = new AddressDao();
	IEmployeeDao edao = new EmployeeDao();

	@Override
	public String saveEmployee(Employee emp) {
		String result=null;
		if (emp.getEmpid() != 0 && emp.getAddress() != null) {
			Address add = adao.getAddress(emp.getAddress().getAid());
			if (add == null) {
				adao.addAddress(emp.getAddress());
			}
			result = edao.addEmployee(emp);
		}
		
		return result;
	}

}
