package org.indra.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.*;

public class BeforeServiceInvocationAspect implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("Se invoca al método " + method.getName() + " de la clase " + target.getClass().getSimpleName());
		
	}

}
