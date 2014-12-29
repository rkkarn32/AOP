package org.SpringAOP.advice;

import org.SpringAOP.model.Person;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LoggingAdvice {
	
//	@Before("execution (* org.SpringAOP.*.*.*(..))")
//	public void logging(JoinPoint joinPoint){
//		System.out.println("Logged method, using execution: "+joinPoint.getSignature().getName());
//	}
//	
//	@Before("within (org.SpringAOP..*)")
//	public void loggingWithin(JoinPoint joinPoint){
//		System.out.println("Logged method, using Within: "+joinPoint.getSignature().getName());
//	}
//	
//	@Before("execution(* org.SpringAOP.*.*.*(..)) && args(person)")
//	public void loggingArgs(JoinPoint joinPoint, Person person){
//		System.out.println("Logged method, using Args: "+joinPoint.getSignature().getName());
//	}
	
//	@AfterReturning(pointcut ="execution(* org.SpringAOP.*.*.*(..))", returning="retValue")
//	public void afterReturningAdvice(JoinPoint joinPoint, Object retValue){
//		StopWatch st = new StopWatch();
//		System.out.println("Method: "+joinPoint.getSignature().getName()+", Return Value: "+retValue);
//	}
	
	@Around("execution(* org.SpringAOP.*.*.show(..))")
	public Object aroundAdvice(ProceedingJoinPoint call) throws Throwable{
		Object []arg = call.getArgs();
		System.out.println("Target Class is: "+call.getTarget().getClass().getSimpleName());
		System.out.println("Argument is : "+arg[0]);
		Object ret = call.proceed();
		return ret;
	}
	
}
