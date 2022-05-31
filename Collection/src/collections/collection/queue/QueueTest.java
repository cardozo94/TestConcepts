package collections.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) throws InterruptedException {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("perro");
		queue.add("gato");
		queue.add("vaca");
		queue.add("burro");
		queue.add("caballo");
		queue.add("perico");
		queue.add("conejo");
		
		queue.forEach(e -> System.out.println(e));
		System.out.println("size "+queue.size());
		 while (!queue.isEmpty()) {
	            System.out.println(queue.remove());
	            Thread.sleep(1000);
	        }
		 System.out.println("size "+queue.size());
	}

}
