package com.zhang.nero.observer.impl;

import com.zhang.nero.observer.IObserver;
import com.zhang.nero.observer.ISubject;

public class Observer implements IObserver {

	private String name;

	public Observer(String name, ISubject subject) {
		subject.registerObserver(this);
		this.name = name;
	}

	@Override
	public void call() {
		System.out.println(name + " has been notified.");
	}

}
