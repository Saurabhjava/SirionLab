package com;

import java.util.function.Predicate;

public class ConsumerDemo implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		if(t.getSalary()>50000)
			return true;
		else
			return false;
	}

	

}
