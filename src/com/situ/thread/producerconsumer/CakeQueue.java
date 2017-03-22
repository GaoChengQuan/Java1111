package com.situ.thread.producerconsumer;

import java.util.LinkedList;

public class CakeQueue {

	private final LinkedList<Cake> queue = new LinkedList<Cake>(); //LinkedList是用来表示串状连接在一起的对象集合体的类，removeFirst/addLast可以进行首尾的操作。

	public synchronized Cake getCake() {
		if (queue.size() <= 0) {
			try {
				System.out.println("wait");
				wait();//this.wait();当前执行的线程在this上等待，也就是在RequestQueue实例对象上面等待  
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return queue.removeFirst();
	}

	public synchronized void putCake(Cake cake) {
		queue.addLast(cake);
		notifyAll();
		System.out.println("notifyAll");
	}

}
