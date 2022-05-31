package oop.patternsdesign.creational.objectpool.pool;

import oop.patternsdesign.creational.objectpool.object.ExportingProcess;

public class ExportingTask implements Runnable {
	
	private ObjectPool3<ExportingProcess> pool;
	private int threadNo;
	
	public ExportingTask(ObjectPool3<ExportingProcess> pool, int threadNo) {
		this.pool = pool;
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		ExportingProcess exportingProcess = pool.borrowObject();
		System.out.println("Thread "+ threadNo+": Object eith process no. "+exportingProcess.getProcessNo()+"was borrowed");
		pool.returnObject(exportingProcess);
		System.out.println("Thread "+ threadNo+": Object eith process no. "+exportingProcess.getProcessNo()+"was returned");
	}

}
