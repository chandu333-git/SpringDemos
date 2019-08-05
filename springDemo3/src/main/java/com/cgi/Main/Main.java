package com.cgi.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Address;
import com.cgi.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1=(Employee)context.getBean("emp1");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getDesig());
		Address ad=emp1.getAddress();
		System.out.println(ad.getHno());
		System.out.println(ad.getStreet());
		System.out.println(ad.getCity());
		

	}

}
