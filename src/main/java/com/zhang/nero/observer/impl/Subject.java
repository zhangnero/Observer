package com.zhang.nero.observer.impl;

import com.zhang.nero.observer.IObserver;
import com.zhang.nero.observer.ISubject;

import java.util.List;
import java.util.Vector;

public class Subject implements ISubject {

	private List<IObserver> observers;

	public Subject() {
		observers = new Vector<IObserver>();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

    @Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.call();
		}
	}

}
