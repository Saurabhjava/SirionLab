package com.sirion.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;

import com.sirion.bean.Address;
import com.sirion.bean.Employee;
import com.sirion.service.EmployeeService;

@Configuration
//@ComponentScan("com.sirion")
@PropertySource("classpath:data.properties")
public class JavaConfig {
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	@Bean
	public Address getAddress() {
		Address address =new Address(1111,"BLR", "India",98797979);
		return address;
	}
	@Bean(value = "es")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		return new EmployeeService();
	}
}
