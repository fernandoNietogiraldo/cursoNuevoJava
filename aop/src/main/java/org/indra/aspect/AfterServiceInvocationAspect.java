package org.indra.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterServiceInvocationAspect implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("Se invoca al método " + method.getName() + " de la clase " + target.getClass().getSimpleName() +
				" y devuelve " + returnValue);
		
	}

}
