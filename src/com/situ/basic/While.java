package com.situ.basic;

import org.junit.Test;

public class While {
	@Test
	public void test1() {
		// 输出5遍Hello world.
		int i = 0;
		while (i < 5) {
			System.out.println("Hello world!");
			i = i + 1;
		}
	}
}
