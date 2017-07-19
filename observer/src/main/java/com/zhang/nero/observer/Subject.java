package com.zhang.nero.observer;

import java.util.List;
import java.util.Vector;

public class Subject implements ISubject {

	private List<IObserver> observers;

	public Subject() {
		observers = new Vector<IObserver>();
	}

	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.call();
		}
	}

}
