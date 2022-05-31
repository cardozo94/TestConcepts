package DataStructures;

import java.util.Arrays;

//import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		/* working with linked list
		 * LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		list.removeFirst();
		System.out.println(list);*/
		
		LinkedList list = new LinkedList();
		System.out.println(list);
		list.addLast(10);
		list.addLast(20);
		list.addFirst(30);
		list.addFirst(40);
		System.out.println(list);
		System.out.println(list.indexOf(30));
		System.out.println(list.contains(25));
		System.out.println(list.size());
		int[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
	}
}
