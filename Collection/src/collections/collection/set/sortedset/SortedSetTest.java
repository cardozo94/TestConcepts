package collections.collection.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("Perro");
		sortedSet.add("Aguila");
		sortedSet.add("Elefante");
		sortedSet.add("Vaca");
		sortedSet.add("Hipopotamo");
		
		sortedSet.forEach(e -> System.out.print(e+ " "));
		sortedSet.add("Gallina");
		System.out.println("");
		sortedSet.forEach(e -> System.out.print(e+" "));
		System.out.println(" ");
		SortedSet<String> subSet = sortedSet.subSet("Elefante", "Perro");
		subSet.forEach(e -> System.out.print(e+" "));
		sortedSet.add("Pato");
		System.out.println(" ");
		sortedSet.forEach(e -> System.out.print(e+" "));
		System.out.println(" ");
		subSet.forEach(e -> System.out.print(e+" "));
		subSet.add("Jirafa");
		System.out.println(" ");
		sortedSet.forEach(e -> System.out.print(e+" "));
		System.out.println(" ");
		subSet.forEach(e -> System.out.print(e+" "));
	}

}
