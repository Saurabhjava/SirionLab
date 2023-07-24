package com.sirion.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sirion.service.EmployeeService;
import com.sirion.util.JavaConfig;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		EmployeeService es=(EmployeeService)ctx.getBean("es");
		EmployeeService es1=(EmployeeService)ctx.getBean("es");
		System.out.println(es==es1);
		

	}

}
