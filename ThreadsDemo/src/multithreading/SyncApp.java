package multithreading;

public class SyncApp {

	
	//main is representing main thread
	public static void main(String[] args) {
				
		System.out.println("==Application started==");
		
		Printer printer = new Printer();
//		printer.printDocuements(10, "CamiloProfile.pdf");
		
		
		//multiple thread working on the same Printer Object, then must syncronize the use of resources
		MyThread mRef = new MyThread(printer);
		YourThread yRef = new YourThread(printer);
		
		mRef.start();
		/*try {
			mRef.join(); //to syncrinoze, but yo should do this for every object
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		yRef.start();
		
		System.out.println("==Application finished==");
	}

}

class Printer{
	
	
	//only one thred can use this method at time, it's locked until thread ends its tasks
	//synchronized 
	void printDocuements(int numOfCopies, String docName) {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing Docuement: "+docName+ " "+(i+1));
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	
	public MyThread(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		
		//synchronize block
		synchronized (pRef) {
			pRef.printDocuements(10, "CristianProfile.pdf");
		}
	}
	
}

class YourThread extends Thread{
	
	Printer pRef;
	
	public YourThread(Printer p) {
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDocuements(10, "CardozoProfile.pdf");
		}
	}
	
}
