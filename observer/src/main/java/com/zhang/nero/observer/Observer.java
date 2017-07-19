package com.zhang.nero.observer;

public class Observer implements IObserver {

	private String name;

	public Observer(String name, ISubject subject) {
		subject.registerObserver(this);
		this.name = name;
	}

	public void call() {
		System.out.println(name + " has been notified.");
	}

}
