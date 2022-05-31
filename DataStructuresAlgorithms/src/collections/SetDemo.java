package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		set.add("Joe");
		
		System.out.println("Set is: "+set);
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Jim");
		System.out.println(set);
		
		if(set.contains("John")) {
			System.out.println("Set contains Jhon");
		}
		
		System.out.println("Size "+set.size());

	}

}
