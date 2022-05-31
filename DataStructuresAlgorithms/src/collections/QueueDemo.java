package collections;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		//PriorityQueue sort the data for us
		for (int i = 10; i > 0; i--) {
			queue.add(i);
		}
		
		//peeking ->Obtain the head of Queue
		//polling -> Remove the head of Queue
		System.out.println("Queue size is: "+queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println("Queue size after poll is: "+queue.size());
		System.out.println(queue.peek());
	}

}
