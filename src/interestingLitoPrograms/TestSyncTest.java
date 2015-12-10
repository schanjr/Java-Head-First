package interestingLitoPrograms;

class TestSync implements Runnable {
	// private static int balance;
	private int balance = 0;
	public void run() {
		for (int i = 0; i < 50; i++) {
			/*
			 * You can also synchronize a method like this way.
			 * synchronized(this) { increment(); }
			 */

			increment();
			System.out.println(Thread.currentThread().getName() + "balance is " + balance);
		}
	}

	public synchronized void increment() {
		int i = balance;
		balance = i + 1;
		// balance = balance + 1;

	}
}

public class TestSyncTest {

	public static void main(String[] args) {
		TestSync job = new TestSync();
		Thread alpha = new Thread(job);
		Thread beta = new Thread(job);
		alpha.setName("Alpha");
		beta.setName("Beta");
		alpha.start();
		beta.start();
	}

}
