package com.priya.operations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/priya/operations/beans.xml");
		ICamera camera = (ICamera)context.getBean("camera");
		camera.snap();
		context.close();
	}

}
