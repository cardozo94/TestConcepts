package oop.patternsdesign.behavioral.iterator.iterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

public class IntSet {
	
	private Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	
	public static class Iterator{
		
		private IntSet set;
		private Enumeration<Integer> e;
		private Integer current;
		
		public Iterator(IntSet in) {
			set = in;
		}
		
		public void first() {
			e = set.ht.keys();
			next();
		}
		
		public boolean isDone() {
			return current == null;
		}
		
		public int currentItem() {
			return current;
		}
		
		public void next() {
			try {
				current = (Integer)e.nextElement();
			} catch (NoSuchElementException e) {
				current = null;
			}
		}
	}

	public void add(int in) {
		ht.put(in, "null");
	}
	
	public boolean isMember(int i) {
		return ht.containsKey(i);
	}
	
	public Hashtable<Integer, String> getHashTable() {
		return ht;
	}
	
	public Iterator createIterator() {
		return new Iterator(this);
	}
}
