package com.priya.operations;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	@Before("execution(void com.priya.operations.Camera.snap())")
	public void readyToTakePhoto() {
		System.out.println("**********Ready to take a photo**********");
	}
	
	@After("execution(void com.priya.operations.Camera.snap())")
	public void afterAdvice() {
		System.out.println("***********Photo clicked*****************");
	}
}
