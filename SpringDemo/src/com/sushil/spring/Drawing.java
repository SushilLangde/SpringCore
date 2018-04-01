package com.sushil.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		Traingle triangle=(Traingle)context.getBean("traingle");
		triangle.draw();

	}

}
