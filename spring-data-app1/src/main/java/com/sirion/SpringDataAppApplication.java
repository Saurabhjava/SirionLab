package com.sirion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sirion.entity.DL;
import com.sirion.entity.Employee;
import com.sirion.entity.Person;
import com.sirion.service.DLService;
import com.sirion.service.EmployeeService;
import com.sirion.service.IEmployeeService;
import com.sirion.service.PersonService;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);
		DLService service=(DLService)ctx.getBean("dService");
		/*
		 * PersonService service=(PersonService)ctx.getBean("personService");
		 * List<String> li=new ArrayList<>(); li.add("LMV"); li.add("HMV");
		 * //service.addDL(new DL("DL-1234001",LocalDate.now(),
		 * LocalDate.parse("2030-01-22"), li));
		 * 
		 * 
		 * 
		 * Person p=new Person("Shridhi", LocalDate.parse("2001-09-16")); p.setDl(new
		 * DL("DL-1234001",LocalDate.now(), LocalDate.parse("2035-01-25"), li));
		 * service.addPerson(p);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Person p=service.getPerson(1);
		 * System.out.println(p.getName()+"\t"+p.getDob());
		 * System.out.println("============DL Details==================="); DL
		 * obj1=p.getDl(); System.out.println(obj1.getDlNo()+"\t"+obj1.getExpDate());
		 */
		DL obj=service.getDL("DL-1234003");
		System.out.println(obj.getPerson().getName()+"\t"+obj.getPerson().getDob());

	}

}
