package collections.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Objeto 0");
		list.add("Objeto 1");
		list.add("Objeto 2");
		list.add("Objeto 3");
		list.add("Objeto 4");
		list.add("Objeto 5");
		list.add("Objeto 6");
		list.add("Objeto 7");
		list.add("Objeto 8");
		list.add("Objeto 9");
		list.add("Objeto 10");
		
		/*for (ListIterator<String> it = ((ArrayList<String>) list).listIterator(); it.hasNext(); ) {
		    System.out.println("next index "+ it.nextIndex());
		    System.out.println("previous index "+ it.previousIndex());
		    String elementn = it.next();
		    System.out.println("next "+elementn);
		    System.out.println("next index "+ it.nextIndex());
		    System.out.println("previous index "+ it.previousIndex());
		    String elementp = it.previous();
			System.out.println("previous "+elementp);
			
			System.out.println("next index "+ it.nextIndex());
		    System.out.println("previous index "+ it.previousIndex());
		}*/
		
		List<String> subList = list.subList(2,6);
		System.out.println("Original");
		list.forEach(e -> System.out.print(e+", "));
		System.out.println("\nSublist");
		subList.forEach(e -> System.out.print(e+", "));
		System.out.println("\nModificaciones 1");
		list.set(3, "Objeto 3 alterado");
		System.out.println("Original");
		list.forEach(e -> System.out.print(e+", "));
		System.out.println("\nSublist");
		subList.forEach(e -> System.out.print(e+", "));
		System.out.println("\nModificaciones 2");
		subList.set(2, "Objeto 4 alterado sublist");
		System.out.println("Original");
		list.forEach(e -> System.out.print(e+", "));
		System.out.println("\nSublist");
		subList.forEach(e -> System.out.print(e+", "));
		System.out.println("\nModificaciones 5");
		List<String> sublist2 = subList.subList(1, 3);
		sublist2.forEach(e -> System.out.print(e+", "));
		
		System.out.println("\nModificaciones 4");
		subList.clear();
		System.out.println("Original");
		list.forEach(e -> System.out.print(e+", "));
		System.out.println("\nSublist");
		subList.forEach(e -> System.out.print(e+", "));

	}

}
