package com.situ.basic;

import org.junit.Test;
/**
 * 变量
 * @author Gao
 *
 */
public class Variable {

	@Test
	public void changeValue() {
		int a = 3;
		int b = 5;
		System.out.println("Before a :" + a);
		System.out.println("Before b :" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After a :" + a);
		System.out.println("After b :" + b);
	}
}
