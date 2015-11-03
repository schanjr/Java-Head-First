package interestingLitoPrograms;

class BankAccount {
	private static int balance = 100;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

/**
 * @author chanst
 *The class 'Thread' looks like a global class that can be accessed anywhere. 
 *Creating extra instances of 'Thread' object means multi-threading already. 
 *If all the threads are expected to be running the same thing, the run() method is probably going to be the same. Thus the below programming design is acceptable.
 *If we simply want to multi-thread with the intention of running everything at the same time, but something different is happening in each threads, then each run()
 *method has to be created individually. 
 */
public class RyanAndMonicaJob implements Runnable {

	private BankAccount account = new BankAccount();
	public static void main(String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
	}

	/**
	 * Synchronized has the advantage of locking your methods without getting accessed by multiple threads. But it does have several costs that comes with it.
	 * <br> 1. It has a huge overhead. 
	 * <br> 2. Only one thread can access it at a time, which defeats the purpose of multi-threading.
	 * <br> 3. It might run into a <a href="http://tutorials.jenkov.com/java-concurrency/deadlock.html">deadlock</a> situation. 
	 * 
	 */
	public void run() {
		for (int x = 0; x < 10; x++) {
			synchronized (this) {
				makeWithdrawal(10);
			}
			if (account.getBalance() < 0) {
				System.out.println("Overdrawn!");
			}
		}

	}
	public void makeWithdrawal(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println((Thread.currentThread().getName() + " woke up."));
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");

		} else {
			System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
		System.out.println("Currently bank has " + account.getBalance());
	}
}
