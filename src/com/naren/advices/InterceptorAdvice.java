package com.naren.advices;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterceptorAdvice implements MethodInterceptor {

	public InterceptorAdvice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		//before method call advice call
		System.out.println("Method "+ methodInvocation.getMethod().getName()+" starts.. where params are"+Arrays.toString(methodInvocation.getArguments()));
		Object result =null;
		try{
			//calling method
			result=methodInvocation.proceed();
		}catch(Exception e){
			//if error comes advice call
			System.out.println("ERRROR in method invocation "+e);
		}
		//after return advice call
		System.out.println("Method "+ methodInvocation.getMethod().getName()+" Ends.. ");
		return result;
	}

}
