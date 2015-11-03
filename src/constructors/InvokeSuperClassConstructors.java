package constructors;
/*
 * 	In OOP, constructors are always inherited (invoked to be more exact) the moment they are instantiated.
	Objects that has a parent super class would also get the constructor invoked. Here are some general rules:
	1.super() is always invoked (in the background by the JVM)
	2.If super class has a multiple constructors, the one that has doesn't have arguments gets invoked. 
*/	

class Animal {
	Animal(){
		System.out.println("Animal is created");
	}
}

class Canine extends Animal {
	String FamilyName;
	
	Canine() {
		System.out.println("Canine is created");
	}
	Canine(String FamilyName){
		this.FamilyName=FamilyName;
		System.out.println("Received Family Name: "+this.FamilyName);
	}
	String getFamilyName(){
		return this.FamilyName;
	}
}


class Dog extends Canine {
	
	//String DogName;
	Dog(){
		this("SnoopDog");
		System.out.println("Dog is created");
		System.out.println("Dog name is: "+this.FamilyName);

	}	
	
	Dog(String FamilyName){
		super(FamilyName);     //Notice super() has to be on the first line of the constructor
		System.out.println("Dog is created ");
		//super();   //Not valid in Java - Throws error
	}
}

public class InvokeSuperClassConstructors {
	public static void main(String[] Args){
		Dog dog1 = new Dog(); //Invokes all the Super() methods that does not have arguments
		System.out.println("----------------------------------------------------------");
		Dog dog2 = new Dog("Canidae");  //Gives the argument to the Canine Class, not Dog class!
		System.out.println("----------------------------------------------------------");
		System.out.println(dog2.getFamilyName()); //This method is inherited from a super class!
	}
}
