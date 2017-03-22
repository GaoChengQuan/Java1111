package com.situ.thread;

import org.junit.Test;

public class ThreadTest {

	@Test
	public void test1() {
		NumbertThread thread1 = new NumbertThread(1);
		NumbertThread thread2 = new NumbertThread(2);
//		thread1.run();
//		thread2.run();
		thread1.start();
		thread2.start();
	}
	
	@Test
	public void testRunnable() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
	}
}
