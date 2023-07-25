package com.sirion;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sirion.entity.Employee;
import com.sirion.service.EmployeeService;
import com.sirion.service.IEmployeeService;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataAppApplication.class, args);
		IEmployeeService service=(EmployeeService)ctx.getBean("employeeService");
		
		//service.addEmployee(new Employee("Himanshi", "Himansgi@gmail.com", LocalDate.parse("2020-02-12"), 105000));
		Employee emp=service.getEmployee(202);
		System.out.println(emp);
		
	}

}
