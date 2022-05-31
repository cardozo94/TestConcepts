package collections.collection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Objeto> collection = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			if (i % 9 != 0)
				collection.add(new Objeto(new Color((int) (Math.random() * 100), (int) (Math.random() * 100),
						(int) (Math.random() * 100)), "nombre" + i));
			else
				collection.add(new Objeto(Color.RED, "nombre" + i));
		}
		long tinit = System.currentTimeMillis();
		collection.parallelStream().filter(e -> e.getColor() == Color.RED)
		.forEach(e -> System.out.println(e.getName()));
		
		long tfinal = System.currentTimeMillis();
		long tspend1 =tfinal-tinit;
		
		tinit = System.currentTimeMillis();
		collection.stream().filter(e -> e.getColor() == Color.RED).forEach(e -> System.out.println(e.getName()));
		tfinal = System.currentTimeMillis();
		System.out.println("time spend "+ (tspend1));
		System.out.println("time spend "+ (tfinal-tinit));
		 CollectionTest test = new CollectionTest();
//		 test.waiting();
		try {
			String joined = collection.stream().map(Objeto::toString).collect(Collectors.joining(", "));
			System.out.println(joined);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Objeto[] array= collection.toArray(new Objeto[0]);
		for (Objeto objeto : array) {
			System.out.print(objeto+", ");
		}

	}
	
	public void waiting() {
		try {
			System.out.println("wait...");
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
