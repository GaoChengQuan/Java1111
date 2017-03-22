package com.situ.thread;

public class SynchronizedTest {
	
	public synchronized void syncIns1() {
		
	}
	
	public void syncIns2() {
		synchronized (this) {
			
		}
	}
	
	public static synchronized void syncClass1() {
		
	}
	
	public static void syncClass2() {
		synchronized (SynchronizedTest.class) {
			
		}
	}

}
