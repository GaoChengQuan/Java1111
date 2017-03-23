package com.situ.basic;

import org.junit.Test;

public class If {

	@Test
	public void test1() {
		int a = 5;
		int b = 3;
		if (a > b) {
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
			System.out.println("a>b");
		} else {
			System.out.println("a<b");
		}
	}
	
	/**
	 * 逢四不逢白，逢四百。
	 * 1.可以被4整除,但不能被100整除
	 * 2.可以被400整除
	 */
	@Test
	public void RunNian() {
		int year = 2017;
		if (year % 4 == 0 && year % 100 != 0 
				|| (year % 400 == 0)) {
			System.out.println(year + " 是闰年");
		} else {
			System.out.println(year + " 是平年");
		}
	}
	
	
}
