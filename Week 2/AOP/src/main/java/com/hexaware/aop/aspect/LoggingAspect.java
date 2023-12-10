package com.hexaware.aop.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
// means writing or printing msg
public class LoggingAspect 
{
// @before and @after are known as advice
	
	@Before("execution(* com.hexaware.aop.service.BankService.*())") // expressn are known as pointcut (AOP)
	public void beforeLogs()
	{
		System.out.println("Before any happened and Logs created");
	}
	
	@After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void afterLogs()
	{
		System.out.println("After any happened and Logs created");
	}

}
