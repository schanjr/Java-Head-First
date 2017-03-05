package tutorial;


//extend is a keyword to inherit. Car is now a child of machine class. Car now has all the methods that Machine has.
public class Car extends Machine {
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	//overwriting the Machine method of start() method
	//Override is itself a class. This class checks if the same super method name exists. If not it will throw an error
	//Seems like a best practice for overriding methods.
	@Override
	public void start(){
		System.out.println("Car has started");
	}
	
	
}
