package com.situ.thread.producerconsumer;

public class Main {

	public static void main(String[] args) {
		CakeQueue queue = new CakeQueue();
		ProducerThread producerThread = new ProducerThread("生产者", queue);
		ConsumerThread consumerThread = new ConsumerThread("消费者", queue);
		producerThread.start();
		consumerThread.start();
	}
}
