package tutorial;
//Working with Machine.java and Car.java files on inheritance testing



public class Inheritance {
	public static void main(String[] args)
	{
	Machine mach1 = new Machine();
	mach1.start();
	mach1.stop();
	
	Car car1 = new Car();
	car1.start();
	car1.wipeWindShield();
	car1.stop();
	
	System.out.println(mach1.getMachine_name());
	
}
	}
