package com.spring.aop.aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Around;
import com.spring.aop.aspects.LoggingAspect;

import com.spring.aop.model.Circle;
@Aspect
public class LoggingAspect {
	
//	@Before( "allGetters()&& allCircleMethod()")
//	public void firstAdvice(JoinPoint joinPoint)
//	{
//		Circle circle =(Circle)joinPoint.getTarget();
//	}
//	
//	
//	@Before("allGetters()")
//   public void secondAdvice()
//   {
//		System.out.println("second advice");
//    } 
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}

	
	
//	@Pointcut("execution(* * com.spring.aop.model.Circle.*(..))")
//	public void allCircleMethod()
//	{
//		
//	}
	

	
//	@Before("args(name)")
//    public void stringArgumentMethod(String name)
//    {
//		System.out.println("string argument callledddd.  the value is "+ name);
//    }
	
	
	
//	@After("args(name)")
//    public void stringArgumentMethod(String name)
//    {
//		System.out.println("string argument callledddd.  the value is "+ name);
//    }
	
	
	
//	@AfterReturning("args(name)")
//    public void stringArgumentMethod(String name)
//    {
//		System.out.println("string argument callledddd.  the value is "+ name);
//    }
	
	
	
//	@AfterThrowing("args(name)")
//    public void exceptionAdwise(String name)
//    {
//		System.out.println("exception has been thrown ");
//    }
	
	
	
//	@AfterReturning(pointcut="args(name)",returning="returnString")
//  public void stringArgumentMethod(String name, Object returnString)
//  {
//		System.out.println("string argument callledddd.  the value is "+ name +" and the output value is "+returnString);
//  }
//	
//	
//	@AfterThrowing(pointcut="args(name)",throwing="ex")
//    public void exceptionAdwise(String name, RuntimeException ex)
//    {
//		System.out.println("exception has been thrown "+ex);
//    }
	
	
//	@Around("@annotation(com.spring.aop.aspects.Loggable)")
//	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
//	{
//		
//		Object returnval=null;
//			try 
//			{
//				 Logger logger = LoggerFactory.getLogger(Circle.class);
//				    logger.info("Hello World");
//				System.out.println("before advise");
//				proceedingJoinPoint.proceed();
//				System.out.println("after advise");
//			}
//			catch(Throwable e)
//			{
//		      System.out.println("after throwing");
//		    }
//	     System.out.println("after finally");
//	     return returnval;
//	}
//}
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		
		Object returnval=null;
			try 
			{
				Logger logger = LoggerFactory.getLogger(Circle.class);
	            logger.info("Hello World");
				System.out.println("before advise");
				proceedingJoinPoint.proceed();
				System.out.println("after advise");
			}
			catch(Throwable e)
			{
		      System.out.println("after throwing");
		    }
	     System.out.println("after finally");
	     return returnval;
	}
	public void loggingAdvise()
	{
		System.out.println("logging from advise");
	}
	}
//	
