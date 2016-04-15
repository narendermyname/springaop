/**
 * 
 */
package com.naren.advices;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author narender
 *
 */
public class AfterReturnMethodAdvice implements AfterReturningAdvice {

	/**
	 * 
	 */
	public AfterReturnMethodAdvice() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("After return method.............");
	}

}
