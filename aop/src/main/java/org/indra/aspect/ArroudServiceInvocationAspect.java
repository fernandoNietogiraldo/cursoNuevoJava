package org.indra.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroudServiceInvocationAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Antes de invocar al m�todo " + invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("Despu�s de invocar al m�todo " + invocation.getMethod().getName());
		result = (String) result + " Alterado";
		return result;
	}

}
