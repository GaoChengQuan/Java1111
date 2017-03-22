package com.situ.thread.producerconsumer;

import java.util.Random;

public class ProducerThread extends Thread {
	private Random random;
	private CakeQueue queue;

	public ProducerThread(String name, CakeQueue queue) {
		super(name);
		this.queue = queue;
		random = new Random(3141592L);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = new Cake("No." + i);
			System.out.println(Thread.currentThread().getName() + " putCake "
					+ cake);
			queue.putCake(cake);
			try {
				Thread.sleep(random.nextInt(1000));//0 <= nextInt(n) < n
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
