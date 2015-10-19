class Apes {
	Apes() {
		System.out.println("Ape Class created");
	}
}

class Humans extends Apes {
	String race;
	Humans(){
		this("Caucasian");   //This method calls a constructor that accepts 1 string if a string is not provided by the initializer
		System.out.println("Called 'this'. ");
	}
	Humans(String race){
		System.out.println("Called Constructor with String");
		this.race=race;
		System.out.println("Race is: "+this.race);
	}
}



public class ThisConstructor {
	public static void main(String[] Args){
		Humans h1=new Humans();  //Gets the default argument which should be Caucasians. 
		System.out.println("----------------------------------------------------------");
		Humans h2=new Humans("Asians"); //Gets the Asians arguments
	}
}
