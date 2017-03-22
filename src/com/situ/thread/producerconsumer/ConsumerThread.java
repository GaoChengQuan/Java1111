package com.situ.thread.producerconsumer;

import java.util.Random;

public class ConsumerThread extends Thread {
	private Random random;
	private CakeQueue queue;

	public ConsumerThread(String name, CakeQueue queue) {
		super(name);
		this.queue = queue;
		random = new Random(6535897L);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = queue.getCake();
			System.out.println(Thread.currentThread().getName() + " getCake "
					+ cake);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
