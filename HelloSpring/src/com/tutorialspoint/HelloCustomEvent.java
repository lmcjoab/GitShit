package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

public class HelloCustomEvent extends ApplicationEvent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloCustomEvent(Object source)
	{
		super(source);
	}
	
	@Override
	public String toString()
	{
		return "HelloCustomEvent [source=" + source + "]";
	}
}
