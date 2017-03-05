package tutorial;




class vars {
	// Instance variables
	String name;
	int age;
	public final String constant = "This variable cannot be changed";

	
	void speak() {
		System.out.println("Example of invoking a method");
	}
	int calcaulateYearsTilRetirement() {
		int lastYears=65-age;
		return lastYears;
	}
	
}

public class Objects_Classes {
	public static void main(String[] args){
		//Creating objects
		
		
		vars obj1 = new vars();
		obj1.name="John Purcell";
		obj1.age=32;
		
		System.out.println(obj1.name + " " + obj1.age);
		obj1.speak();

		
		System.out.println(obj1.constant);
		//obj1.constant="Attempting to change a final variable"; //removing this comment will throw an error 
		
	}}

