package interestingLitoPrograms;

/**
 * @author chanst
 *MyThread is a class that creates the run() method which is being passed to threads. <br>
 *The thread starts out with creating two variables in the constructor. One used for randomly delaying the thread. The other for saving this thread's name. 
 *(Which is actually accessible through Thread.getname() as well. 
 */
class MyThread implements Runnable {
	double delay=0;
	String threadName;
	static final StringBuffer alphabets = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
	private Object[] String;
	MyThread() {
		this.delay=(Math.random() * 5000);
		this.threadName=genName();  //<---Pretty much created my own Thread.setName();
	
	}

	
	
	/**
	 * This is like the "main" method for threads. This method has to overridden
	 * and a thread.start() calls this by default.
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Delaying this thread for: "+this.delay+" seconds...");
		doMore();
		System.out.println("Finished calling run() method from the thread. ");
		System.out.println("--------------------------------------------------------");

	}
	void doMore() {
		System.out.println("Calling from doMore() method at: " + this.threadName);
		try {
			Thread.sleep((long) this.delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static String genName() {
		 StringBuffer result = new StringBuffer();
		 String finalName;
		 for (int i=0;i<5;i++) {
			 result.append(alphabets.charAt((int) (Math.random() * alphabets.length())));
		 }
		 result.append("-thread");
		 finalName=result.toString();
		 return finalName;
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
		smallThread sT = new smallThread();
		
		sT.run();	
	}
	

}

class smallThread extends Thread{

	public void run() {
		shout();
	}
	public void shout() {
		System.out.println("A big shoutOut");
	}
	
}
