package com.cgi.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Hello hello=(Hello)context.getBean("hello");
	System.out.println(hello.Stephanie());

	}

}
