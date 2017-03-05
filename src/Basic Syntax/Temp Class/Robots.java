package tutorial47;

public class Robots {
	private int id;

	public Robots(int id) {
		this.id = id;
	}

	class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking");

		}
	}

	static class Battery{
		public void charge(){
			System.out.println("Battery is charging");
		}
	}
	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
		
		//You can create a class within a method
		final String name = "Stanley";
		class temp{
			public void doSomething(){
				System.out.println();
				System.out.println("The ID is..." + id);
				System.out.println("The name is always: " + name);
			}
		

		}
		temp temp1 = new temp();
		temp1.doSomething();
	}
	
	
	
}
