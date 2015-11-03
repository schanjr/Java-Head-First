package interestingLitoPrograms;


class TestSync implements Runnable{
	//private static int balance;
	private int balance;
	public void run() {
		for (int i=0;i<50; i++) {
			increment();
			System.out.println(Thread.currentThread().getName()+"balance is "+ balance);
		}
	}
	
	public void increment() {	
		int i = balance;
		balance = i + 1;
		//balance = balance + 1;
	
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
