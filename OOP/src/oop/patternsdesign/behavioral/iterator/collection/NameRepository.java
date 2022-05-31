package oop.patternsdesign.behavioral.iterator.collection;

import oop.patternsdesign.behavioral.iterator.iterator.Iterator;

public class NameRepository implements Container {
	
	public String names[] = {"Robert", "Jhon", "Julie", "Lora"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator{

		int index;
		
		@Override
		public boolean hasNext() {
			if(index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return names[index++];
			return null;
		}
		
	}
}
