package org.SpringAOP.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	
	@Before("execution (* org.SpringAOP.*.*.*(..))")
	public void logging(JoinPoint joinPoint){
		System.out.println("Logged method, using execution: "+joinPoint.getSignature().getName());
	}
	
	@Before("within (org.SpringAOP..*(..))")
	public void loggingWithin(JoinPoint joinPoint){
		System.out.println("Logged method, using Within: "+joinPoint.getSignature().getName());
	}
}
