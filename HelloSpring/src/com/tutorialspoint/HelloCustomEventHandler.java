package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

public class HelloCustomEventHandler implements ApplicationListener<HelloCustomEvent>
{
	@Override
	public void onApplicationEvent(HelloCustomEvent event)
	{
		System.out.println(event.toString());
	}
}
