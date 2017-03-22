package com.situ.thread.producerconsumer;

public class Cake {
	private String name;

	public Cake(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}
}
