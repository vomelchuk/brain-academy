package com.brainacad.oop.testrecflection1;

import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	private static String SPACE = " ", TAB = "\t", LEFT = "(", RIGHT = ")";

	public static void main(String[] args) {

		MyClass c = new MyClass();
		Class<?> cls = MyClass.class;
		printClassInfo(cls);
		printPublicFields(cls);
		printAllFields(cls);
		printConstructors(cls);
		printMethods(cls);
		invokeMethod(cls);
	}

	private static void invokeMethod(Class<?> cls) {
		pln("\n\nIllustration invoke() method:");
		Class<?>[] paramType = new Class<?>[] {};
		try {
			Constructor<?> constructor = cls.getConstructor(paramType);
			MyClass myClass = (MyClass) constructor.newInstance();
			pln("Created instance MyClass with reflection:\n" + myClass);
			Class<?>[] paramMethodTypes = new Class<?>[] { int.class };
			Method method = myClass.getClass().getMethod("setB", paramMethodTypes);
			Object[] arguments = new Object[] { 33 };
			method.invoke(myClass, arguments);
			pln("The same instance after invoke() method setted b to 33:\n" + myClass);
			pln("All fields of instance:");
			Field[] fields = cls.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				Class<?> fieldType = field.getType();
				pln(TAB + Modifier.toString(field.getModifiers()) + SPACE + fieldType.getSimpleName() + SPACE
						+ field.getName() + "=" + field.getInt(myClass));
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private static void printClassInfo(Class<?> cls) {
		Package pack = cls.getPackage();
		pln("Package name: " + pack.getName());
		pln("\nClass name and modifiers: " + Modifier.toString(cls.getModifiers()) + " " + cls.getSimpleName());

	}

	private static void printPublicFields(Class<?> cls) {
		pln("\nPublic fields:");
		Field[] fields = cls.getFields();
		for (Field field : fields) {
			Class<?> fieldType = field.getType();
			pln(TAB + Modifier.toString(field.getModifiers()) + SPACE + fieldType.getSimpleName() + SPACE
					+ field.getName());
		}

	}

	private static void printAllFields(Class<?> cls) {
		pln("\nAll fields:");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			Class<?> fieldType = field.getType();
			pln(TAB + Modifier.toString(field.getModifiers()) + SPACE + fieldType.getSimpleName() + SPACE
					+ field.getName());
		}

	}

	private static void printConstructors(Class<?> cls) {
		pln("\nConstructors:");
		Constructor<?>[] constructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			p(TAB + Modifier.toString(constructor.getModifiers()) + SPACE + cls.getSimpleName() + LEFT + SPACE);
			Class<?>[] paramTypes = constructor.getParameterTypes();
			for (Class<?> paramType : paramTypes) {
				p(paramType.getSimpleName() + SPACE);
			}
			p(RIGHT + "\n");
		}
	}

	private static void printMethods(Class<?> cls) {
		pln("\nMethods:");
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			p(TAB + Modifier.toString(method.getModifiers()) + SPACE + method.getName() + LEFT + SPACE);
			Class<?>[] paramMethodTypes = method.getParameterTypes();
			for (Class<?> paramMethodType : paramMethodTypes) {
				p(paramMethodType.getSimpleName() + SPACE);
			}
			p(RIGHT + "\n");
		}
	}

	private static void pln(Object o) {
		System.out.println(o);
	}

	private static void p(Object o) {
		System.out.print(o);
	}
}
