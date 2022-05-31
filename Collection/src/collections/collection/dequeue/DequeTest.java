package collections.collection.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Amarillo");
		deque.add("Azul");
		deque.add("Rojo");
		deque.add("Verde");
		deque.add("Gris");
		deque.add("Morado");
		deque.add("Purpura");
		deque.add("Magenta");

		deque.forEach(e-> System.out.print(e+", "));
		deque.addFirst("Violeta");
		System.out.println("");
		deque.forEach(e-> System.out.print(e+", "));
	}

}
