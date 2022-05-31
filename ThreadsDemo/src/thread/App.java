package thread;

public class App {

	//main method represents main thread
	public static void main(String[] args) {
		//threads always execute the jobs in a sequence
		
		System.out.println("==Application Started==");

		/*MyTask task = new MyTask();//child Thread/ worker thread
		task.start();*/
		
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
		
		Thread yourTask = new Thread(new YourTask());
		yourTask.start();
		
		for(int doc =1; doc<=10; doc++) {
			System.out.println("Printing Document #"+doc);
		}
		
		System.out.println("==Application Finished==");
	}

}
//If this jobs is too long now it is useful implements a thread
/*class MyTask{
	
	void executeTaks() {
		for (int doc = 0; doc < 10; doc++) {
			System.out.println("@@ Printing Document # "+doc+" -Printer2");
		}
	}
}*/

//MyTask IS-A Thread
/*class MyTask extends Thread{
	@Override
	public void run() {
		for (int doc = 0; doc < 10; doc++) {
			System.out.println("@@ Printing Document # "+doc+" -Printer2");
		}
	}
}*/

//MyTask IS-A Thread
class MyTask implements Runnable{
	@Override
	public void run() {
		for (byte doc = 0; doc < Byte.MAX_VALUE; doc++) {
			System.out.println("@@ Printing Document # "+doc+" -Printer2");
		}
	}
}

//YourTask IS-A Thread
class YourTask implements Runnable{
	@Override
	public void run() {
		for (short doc = 0; doc < (Byte.MAX_VALUE*2); doc++) {
			System.out.println("** Printing Document # "+doc+" -Printer3");
		}
	}
}
