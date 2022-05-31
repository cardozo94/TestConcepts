package collections;

import java.util.ArrayList;
import java.util.Iterator;

import DataStructures.Array;

public class ListDemo {
	
	public static void main(String[] args) {
		//only store Stirng objects
		ArrayList<String> list1 = new ArrayList<String>();
		//store any type of objects
		ArrayList list2 = new ArrayList();
		
		list1.add("John"); //0
		list1.add("Jennie"); //1
		list1.add("Jim"); //2
		list1.add("Jack"); //3
		list1.add("Joe"); //4
		list1.add("John"); //1
//		list1.add(10); //error
//		list1.add(2.2); //error
		
		Array array = new Array(11);
		list2.add("John");
		list2.add(10);
		list2.add(2.2);
		list2.add('A');
		list2.add(array);
		
		System.out.println("list1 is: "+list1);
		System.out.println("list2 is: "+list2);
		
		String name = list1.get(2);
		System.out.println("name is: "+name);
		
		Object o = list2.get(2);
		System.out.println("o is: "+o);
		
		list1.set(2, "Fionna");
		System.out.println("list1 now is: "+list1);
		
		list1.remove(2);
		System.out.println("list1 after delete is: "+list1);
		
		if(list1.contains("John")) {
			System.out.println("John is in the list");
		}
		
		System.out.println("====Iterating list=====");
		for (String str : list1) {
			System.out.println(str);
		}
		System.out.println("=========");
	}

}
