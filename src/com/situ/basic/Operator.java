package com.situ.basic;

import org.junit.Test;

/**
 * 操作符
 * 
 * 1. 算数运算符 2. 比较运算符 3. 逻辑运算符 4. 位运算符
 * 
 * @author Gao
 * 
 */
public class Operator {

	/**
	 * 1、算数运算符
	 */
	@Test
	public void test1() {
		/* + - * / % */
		int a = 5;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	/**
	 * 1、算数运算符
	 */
	@Test
	public void FenJieSanWeiShu() {
		// 分解一个三位数 186 = 1*100 + 8*10 + 6
		int num = 186;
		int bai = num / 100;
		int shi = num % 100 / 10;
		int ge = num % 100 % 10;
		System.out.println("百位数：" + bai);
		System.out.println("十位数：" + shi);
		System.out.println("个位数：" + ge);
	}
	
	/**
	 * 2、逻辑运算符
	 */
	@Test
	public void test3() {
		int a = 5;
		int b = 3;
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		// 运算的结果是true/false表真假 也就是boolean
		// 有逻辑运算符才有了我们的流程控制语句if语句。
	}
}
