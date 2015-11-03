package interestingLitoPrograms;

class MyThread implements Runnable {
	double delay=0;
	String mem;
	MyThread() {
		this.delay=(Math.random() * 5000);
		this.mem = getClass().getName();
		
	}

	/**
	 * This is like the "main" method for threads. This method has to overridden
	 * and a thread.start() calls this by default.
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		doMore();
		System.out.println("Delaying this thread for: "+this.delay+" seconds...");
		System.out.println("Finished calling run() method from the thread. ");
		System.out.println("--------------------------------------------------------");

	}
	void doMore() {
		System.out.println("Calling from doMore() method at: " + this.mem);
		try {
			Thread.sleep((long) this.delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadTest {

	/**
	 * Tutorial declares the thread itself as <br>
	 * Runnable threadJob = new MyThread(); <br>
	 * but looks like the following works as well:<br>
	 * Runnable threadJob = new MyThread(); <br>
	 * the only method I have to care about is run().
	 * 
	 * @param  .start(): gets the threads started and calls all the run() method at the same time.
	 * @param  .join() : Makes sure all the threads are completed before running
	 *         the next line of codes in main().
	 *         
	 */
	public static void main(String[] args) {
		MyThread threadJob;
		Thread threadHolder = null;

		for (int i = 0; i < 10; i++) {
			threadJob = new MyThread();
			threadHolder = new Thread(threadJob);
			System.out.println("Name: "+ Thread.currentThread().getName()+" Priority: "+threadHolder.getPriority());
			threadHolder.start();
		
		}

		try {
	
			threadHolder.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished Threads");
	}
}
