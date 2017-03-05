package tutorial42;


/*Abstract classes
Abstract Classes vs Interface
Abstract classes forces the child classes that inherits them to customize their own functionality. 
This is great for planned inheritance

Interface on the other hand is much more granular that defines for more specific methods that needs to be created.
*/


public class App {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setId(15);
		System.out.println(car1.getId());
		
		
		
		
	}

}
