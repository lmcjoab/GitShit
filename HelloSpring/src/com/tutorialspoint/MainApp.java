package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
   public static void main(String[] args)
   {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      HelloCustomEventPublisher cvp = (HelloCustomEventPublisher) context.getBean("customEventPublisher");
      
      context.start();
      cvp.publish();
      
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.printMessage();
      
      cvp.publish();
      //Car genCar = (Car) context.getBean("carBean");
      
      context.registerShutdownHook();
      
      cvp.publish();
      context.close();
      context.stop();
   }
}
