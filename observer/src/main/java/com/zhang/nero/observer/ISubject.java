package com.zhang.nero.observer;

public interface ISubject {
	void registerObserver(IObserver observer);

	void notifyObservers();
}
