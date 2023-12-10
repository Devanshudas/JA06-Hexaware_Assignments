package com.hexaware.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.service.BankService;
import com.hexaware.configs.AppConfig;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BankService service = context.getBean(BankService.class);
        
        service.fundTransfer();
        service.withdraw();
        
        
    
    }
    
}