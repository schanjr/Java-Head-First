package tutorial47;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robots robot = new Robots(6);
		robot.start();
		
		
/*		Robots.Brain brain = robot.new Brain();
		brain.think();*/
		
		
		//Creates an instance of an inner class
		Robots.Battery battery = new Robots.Battery();
		battery.charge();
		
	}

}
