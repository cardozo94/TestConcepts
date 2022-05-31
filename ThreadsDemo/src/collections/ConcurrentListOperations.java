package collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListOperations {
	public static void main(String[] args) {
		List<Integer> temp_list = Arrays.asList(1, 2, 3);
		List<Integer> list = new CopyOnWriteArrayList<>(temp_list);
		new WriteThread("Writer", list).start();
		new ReadThread("Reader", list).start();
	}
}

class WriteThread extends Thread {
	private final List<Integer> list;

	public WriteThread(String name, List<Integer> list) {
		this.list = list;
		super.setName(name);
	}

	public void run() {
		int count = 4;
		int counter = 0;
		do {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			list.add(count++);
			System.out.println(super.getName() + " done");
			counter++;
		} while (counter != 5);
	}
}

class ReadThread extends Thread {
	private final List<Integer> list;

	public ReadThread(String name, List<Integer> list) {
		this.list = list;
		super.setName(name);
	}

	public void run() {
		while (true) {
			StringBuilder output = new StringBuilder("\n" + super.getName() + ":");
			for (Integer nextVal : list) {
				output.append(" ").append(nextVal);
			}
			System.out.println(output);
		}
	}
}
