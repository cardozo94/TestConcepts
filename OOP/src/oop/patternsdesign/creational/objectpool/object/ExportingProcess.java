package oop.patternsdesign.creational.objectpool.object;

public class ExportingProcess {

	private long processNo;
	
	public ExportingProcess(long processNo) {
		this.processNo = processNo;
		// do some  expensive calls / tasks here in future  
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Object with process no. "+this.processNo+" was created");
	}
	
	public long getProcessNo() {
		return processNo;
	}
}
