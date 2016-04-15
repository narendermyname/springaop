package com.naren.advices;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 */

/**
 * @author narender
 *
 */
public class BeforeMethodAdvice implements MethodBeforeAdvice {

	/**
	 * 
	 */
	public BeforeMethodAdvice() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Before Method XCall............");
	}

}
