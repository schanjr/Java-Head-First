package tutorial48;

public class Enums {
	
	//Enums is great for storing constants that will be used by methods. That is all....
	//http://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
	
	/*public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;*/
	
	public static void main(String[] args) {
		
		Animals animal = Animals.CAT;
		
		switch(animal){
		case CAT:
			break;
		case DOG:
			break;
		case MOUSE:
			break;
		default:
			break;
		
		}
/*		switch(animal){
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			System.out.println("Don't know what it is");
			break;
		}*/

		System.out.println(Animals.CAT);
		System.out.println(Animals.DOG.getClass());
		System.out.println(Animals.MOUSE instanceof Enum);
		System.out.println(Animals.DOG.getName()+ ": Is being called from: " + Animals.DOG.getDeclaringClass());
		System.out.println(Animals.valueOf("DOG"));
	}

}
