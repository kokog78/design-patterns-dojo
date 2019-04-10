package dojo.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import dojo.patterns.bridge.PizzaOrderHandler;

public class PizzaOrderHandlerProxyFactory {

	public PizzaOrderHandler createProxyFor(PizzaOrderHandler originalHandler) {
		Class<?>[] interfaces = new Class<?>[] {PizzaOrderHandler.class};
		InvocationHandler handler = (proxy, method, args) -> invoke(originalHandler, method, args);
		PizzaOrderHandler proxy = (PizzaOrderHandler) Proxy.newProxyInstance(
				getClass().getClassLoader(),
				interfaces,
				handler);
		return proxy;
	}

	private Object invoke(PizzaOrderHandler originalObject, Method method, Object[] args) throws Throwable {
		// TODO metódus hívás kiloggolása: logMethodCall
		// TODO eredeti metódus meghívása: callMethod
		// TODO visszaadott érték loggolása: logResult
		// TODO visszaadott értékkel kell visszatérni
		return null;
	}
	
	private Object callMethod(Object obj, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return method.invoke(obj, args);
	}
	
	private void logMethodCall(Method method, Object[] args) {
		System.out.println("Class: " + method.getDeclaringClass().getSimpleName());
		System.out.println("Method: " + method.getName());
		System.out.println("Parameters:");
		for (Object arg : args) {
			System.out.println("\t" + arg);
		}
	}
	
	private void logResult(Object result) {
		System.out.println("Result: " + result);
	}
	
}
