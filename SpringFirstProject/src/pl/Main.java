package pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HelloWrod;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWrod h=(HelloWrod)ctx.getBean("hello");
		h.setName("Dhruv");
		
		System.out.println(h.sayHello());
		
		HelloWrod h1=(HelloWrod)ctx.getBean("hello");
		h1.setName("Yash");
		
		System.out.println(h1.sayHello());
		System.out.println(h.sayHello());
		
		System.out.println(h);
		System.out.println(h1);
	}

}
