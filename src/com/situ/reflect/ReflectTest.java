package com.situ.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest {

	@Test
	public void reflectClass() throws ClassNotFoundException {
		Class class1 = Person.class;
		Class class2 = Class.forName("com.situ.reflect.Person");
		Class class3 = new Person().getClass();
		System.out.println(class1 == class2);
		System.out.println(class2 == class3);
	}

	@Test
	public void reflectConstructorFunction() throws Exception {
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		Constructor constructor = clazz.getConstructor(String.class);
		Person person = (Person) constructor.newInstance(new String("situ"));
		System.out.println(person.getName());
		;
	}

	@Test
	public void reflectMethod() throws Exception {
		Class clazz = Person.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("-------------");

		Class clazz2 = Person.class;
		Object object = clazz2.getConstructor().newInstance();
		Method setMethod = clazz2.getDeclaredMethod("setName",
				new Class[] { String.class });
		setMethod.invoke(object, "situ");
		Method getMethod = clazz2.getDeclaredMethod("getName");
		System.out.println(getMethod.invoke(object));
	}


	@Test
	public void testChangeField() throws Exception {
		Person person = new Person();
		System.out.println(person);
		changeField(person);
		System.out.println(person);
	}

	private void changeField(Object obj) throws IllegalArgumentException,
			IllegalAccessException {
		// 1.获得对应Class
		Class clazz = obj.getClass();
		// 2.获得所有的Fields
		Field[] fields = clazz.getDeclaredFields();
		// 3.遍历所有的Field，如果是String类型，将b给成a
		for (Field field : fields) {
			// 3.1 判断是否是String类型
			// private Class<?> type;
			if (field.getType() == String.class) {
				field.setAccessible(true);
				// 3.2如果是String类型取出属性值
				String oldValue = (String) field.get(obj);
				// 3.3将属性值中的b改成a
				String newValue = oldValue.replace("b", "a");
				// 3.4将修改后的值设置到属性中
				field.set(obj, newValue);
			}
		}
	}

	@Test
	public void testCopy() throws Exception {
		Person2 person = new Person2("gao", 30);
		System.out.println(person);
		Person2 copyPerson = (Person2) copy(person);
		System.out.println(copyPerson);
	}

	public Object copy(Object object) throws Exception {
		// 1.获得所有的属性
		Class<?> clazz = object.getClass();
		Object objectCopy = clazz.getConstructor().newInstance();
		Field[] fields = clazz.getDeclaredFields();
		// 2.遍历属性赋值
		for (Field field : fields) {
			// name->Nmae->getName->methodGetName
			// 2.1 获得属性的名字：Name
			String name = field.getName();
			// 2.2 将首字母变成大写 N
			String firstLetter = name.substring(0, 1).toUpperCase();
			// 2.3 拼凑方法名 get+N+ame=getName setName
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);
			// 2.4 获得Method getName()/setName()
			Method getMethod = clazz.getMethod(getMethodName, new Class[] {});
			Method setMethod = clazz.getMethod(setMethodName,
					new Class[] { field.getType() });
			// 2.4获得属性值value
			Object value = getMethod.invoke(object, new Class[] {});
			// 2.5将value属性值设置到要拷贝的对象中
			setMethod.invoke(objectCopy, new Object[] { value });
		}
		return objectCopy;
	}

}
