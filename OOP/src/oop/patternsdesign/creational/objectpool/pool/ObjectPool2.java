package oop.patternsdesign.creational.objectpool.pool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool2<T> {
	
	long deadTime;
	
	Hashtable<T, Long> lock, unlock;
	
	ObjectPool2() {
		deadTime = 50_000;
		lock = new Hashtable<T, Long>();
		unlock = new Hashtable<T, Long>();
	}
	
	abstract T create();
	abstract boolean validate(T o);
	abstract void dead(T o);
	
	public synchronized T takeOut() {
		long now = System.currentTimeMillis();
		T t;
		if(unlock.size() > 0) {
			Enumeration<T> e = unlock.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();
				if((now -unlock.get(t)) > deadTime) {
					unlock.remove(t);
					dead(t);
					t = null;
				}else {
					if(validate(t)) {
						unlock.remove(t);
						lock.put(t, now);
						return (t);
					}else {
						unlock.remove(t);
						dead(t);
						t = null;
					}
				}
				
			}
		}
		t = create();
		lock.put(t, now);
		return t;
	}
	
	public synchronized void takeIn(T t) {
		lock.remove(t);
		unlock.put(t, System.currentTimeMillis());
	}

}
