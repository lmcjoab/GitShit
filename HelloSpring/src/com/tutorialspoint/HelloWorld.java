package com.tutorialspoint;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld 
{
   private String message;
   
   public HelloWorld()
   {
	   //System.out.println("HelloWorld constructor");
   }

   public void setMessage(String message)
   {
      this.message  = message;
   }  
   
   public String getMessage()
   {
	   return message;
   }

   public void printMessage()
   {
	   System.out.println("Your Message: " + message);
   }
   
   @PostConstruct
   public void init()
   {
	   System.out.println("HelloWorld init method called");
   }
   
   @PreDestroy
   public void destroy()
   {
	   System.out.println("HelloWorld destroy called.");
   }
}