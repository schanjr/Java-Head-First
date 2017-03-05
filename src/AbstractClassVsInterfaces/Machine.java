package tutorial42;

public abstract class Machine {
	private int id;	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	abstract void start();
	//Creates an error	{System.out.println("starting camera")};
	abstract void doSomething();
	abstract void shutDown();
	
	public void work(){
		start();
		doSomething();
		shutDown();
	}
	
}
