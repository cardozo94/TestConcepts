package map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedMapTest {

	public static void main(String[] args) {
		SortedMap<String, String> sortedMap = new TreeMap<String, String>();
		sortedMap.put("Perro", "4 patas 1 cola y hocico");
		sortedMap.put("Aguila", "2 alas y pico");
		sortedMap.put("Elefante", "4 patas 1 cola y trompa");
		sortedMap.put("Vaca", "4 patas 1 cola y ubres");
		sortedMap.put("Hipopotamo", "4 patas 1 cola y hocico y acuatico");
		
		for (String string : sortedMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+sortedMap.get(string));
		}
		System.out.println("1");
		sortedMap.put("Gallina", "2 patas 2 alas y pico");
		for (String string : sortedMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+sortedMap.get(string));
		}
		System.out.println("2");
		SortedMap<String, String> subMap = sortedMap.subMap("Elefante", "Perro");
		for (String string : subMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+subMap.get(string));
		}
		System.out.println("3");
		sortedMap.put("Pato", "2 patas 2 alas y pico y acuatico");
		for (String string : sortedMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+sortedMap.get(string));
		}
		for (String string : subMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+subMap.get(string));
		}
		System.out.println("4");
		subMap.put("Jirafa", "4 patas cuello largo");
		for (String string : sortedMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+sortedMap.get(string));
		}
		for (String string : subMap.keySet()) {
			System.out.println(" Key --> "+string+". Value--> "+subMap.get(string));
		}
	}

}
