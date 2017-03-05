package constructors;
//If you have more than one constructor in a class, it means you have overloaded constructors.

class Duck{
	private int weight;
	private String message;
	
	public Duck(){
		this.weight=0;
		System.out.println("No parameter given in Constructor. Default weight size: "+this.weight);
		//System.out.println(this);
	}
	
	public Duck(int weight){
		this.weight=weight;
		System.out.println("Constructor initialized. Duck Weight is "+this.weight);
	}
	public Duck(String input){
		this.message=input;
		System.out.println("String Constructuor Initialized: " +this.message);
	}
	
	
	
}
public class ConstructorDefaultParameterExample {
	public static void main(String[] args){
		Duck duck1=new Duck(99);
		Duck duck2=new Duck();
		Duck duck3=new Duck("Whatsup Doc?");
	}
}