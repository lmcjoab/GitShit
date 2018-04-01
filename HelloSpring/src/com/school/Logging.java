package com.school;

public class Logging
{
	/** 
	 * This is the method which I would like to execute
	 * before method execution.
	 */
	public void beforeAdvice()
	{
		System.out.println("AOP before");
	}

	/** 
	 * This is the method which I would like to execute
	 * after method execution.
	 */
	public void afterAdvice()
	{
		System.out.println("AOP after");
	}

	/** 
	 * This is the method which I would like to execute
	 * when a method returns.
	 */
	public void afterReturningAdvice(Object retVal)
	{
		System.out.println("AOP return:" + retVal.toString() );
	}

	/**
	 * This is the method which I would like to execute
	 * if an exception  is raised.
	 */
	public void AfterThrowingAdvice(Exception ex)
	{
		System.out.println("AOP - There has been an exception: " + ex.toString());   
	}
}
