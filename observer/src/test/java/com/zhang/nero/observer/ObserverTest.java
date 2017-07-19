package com.zhang.nero.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void testObserver(){
		ISubject subject = new Subject();
		
		for(Integer i = 0; i < 10; i++){
			new Observer(i.toString(), subject);
		}
		
		subject.notifyObservers();
	}
}
