package com.situ.thread;

public class NumbertThread extends Thread{
	private int first;
	
	public NumbertThread(int first) {
		this.first = first;
	}
	
	@Override
	public void run() {
		super.run();
		for (int i = first; i < 50; i+=2) {
			System.out.print(i + " ");
		}
	}
}
