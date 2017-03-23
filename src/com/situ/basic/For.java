package com.situ.basic;

import org.junit.Test;

public class For {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 5, 7, 34, 78 };
		printArray(array);
	}

	/**
	 * 定义功能，用于打印数组中的元素。元素间用逗号隔开。 int[] arr = new int[]{10, 5, 7}; 要求打印结果：[10, 5,
	 * 7]
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("]");
	}

	// ****
	// ****
	// ****
	@Test
	public void test1() {
		// *
		// *
		// *
		// for (int i = 0; i < 3; i++) {
		// System.out.println("*");
		// }
		// ****
		// for (int i = 0; i < 4; i++) {
		// System.out.print("*");
		// }

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// *
	// **
	// ***
	// ****
	// *****
	@Test
	public void test2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 1
	// 12
	// 123
	// 1234
	// 12345
	@Test
	public void test3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// 1*1=1
	// 1*2=2 2*2=4
	// 1*3=3 2*3=6 3*3=9
	@Test
	public void test4() {
		int x = 9;
		chengFaBiao(x);
		System.out.println("----------");
		chengFaBiao(3);
		System.out.println("----------");
		chengFaBiao(7);
	}

	private void chengFaBiao(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				// 2*3 = 6
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println();
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				
			}
		}
	}

}
