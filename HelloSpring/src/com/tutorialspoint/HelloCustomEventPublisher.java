package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class HelloCustomEventPublisher implements ApplicationEventPublisherAware
{
	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher (ApplicationEventPublisher publisher)
	{
		this.publisher = publisher;
	}
	
	public void publish()
	{
		HelloCustomEvent ce = new HelloCustomEvent(this);
		publisher.publishEvent(ce);
	}
}
