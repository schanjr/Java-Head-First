package tutorial29;


/*Upcasting and downcasting 
The type of variable tells us which methods the variable can access 
The object that the variable refers to is the actual method that gets executed. */


class Machine {
	public void start(){
		System.out.println("Machine has started");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera has started");
	}
	public void snap(){
		System.out.println("Photo Taken");
	}
}


public class SmallInheritance {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		
		//Upcasting
		Machine machine2 = camera1;
		machine2.start();
		//error machine2.snap();
		
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		//Doesn't work -- runtime error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.snap();
		
	}

}
