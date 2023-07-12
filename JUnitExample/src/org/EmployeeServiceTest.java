package org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Employee;
import com.EmployeeRepository;
import com.EmployeeService;
import com.IEmployeService;

class EmployeeServiceTest {
	private IEmployeService eService;
	@BeforeEach
	public void initialize() {
		eService=new EmployeeService();
	}
	@AfterEach
	public void destroy() {
		eService=null;
	}
	@Test
	void addTest() {
		int size=EmployeeRepository.getEmployeeList().size();
		eService.addEmployee(new Employee(105,"Bhupendra","bhup@gmail.com"));
		assertEquals(size+1, EmployeeRepository.getEmployeeList().size());
	}
	@Test
	void getEmployeeTest() {
		assertNull(eService.getEmployee(1010));
		assertEquals("Dhruva", eService.getEmployee(1002).getName());
	}

}
