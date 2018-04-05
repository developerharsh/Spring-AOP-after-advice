package mypack;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAfterAdvice implements AfterReturningAdvice
{

	@Override
	public void afterReturning(Object arg0, Method method1, Object[] arg2, Object arg3) throws Throwable
	{
		System.out.println("After Advice "+method1.getName());
		
	}

	
}
