package tutorial1;
//package tutorials;
import java.lang.Math;



class Test1{

     public static void StringBufferExample(){
       StringBuffer sBuffer = new StringBuffer(" test");
       sBuffer.append(" String Buffer");
       System.out.println(sBuffer); 
       int randint = (int) (Math.random() * 3);
       System.out.println("Random int generated from Test class " + randint);
   }
}



public class Primitive_Types_And_Strings {
	public static void main(String[] args) {
		/**public means that the method is visible and can be called from other objects of other types. 
		Other alternatives are private, protected, package and package-private. See below for more details.
		
		Access Levels
		Modifier	Class	Package	Subclass	World
		public			Y		Y		Y		Y
		protected		Y		Y		Y		N
		no modifier		Y		Y		N		N
		private			Y		N		N		N     
		
		static means that the method is associated with the class, not a specific instance (object) of that class. 
		This means that you can call a static method without creating an object of the class.
		http://stackoverflow.com/questions/3903537/i-want-to-know-the-difference-between-static-method-and-non-static-method
		
		void means that the method has no return value. If the method returned an int you would write int instead of void.
		
		                **/
		
		
		System.out.println("Here are a list of datatypes");
		//Primitive Data Types
		//Immutable examples
		byte Byte=0;
		short Short=3;
		int Int=4;
		long Long= 10000000;
		double Double = 10.00000d;
		float Float = 10.1010010101f;
		char Char = '\u0000';
		boolean Boolean = true;
		System.out.println(Byte);
		System.out.println(Byte+Short+Int);
		//None - Primitive Data Types
		String text="Hello";
		String blank=" ";
		String name = "Bob";
		System.out.println(text+blank+name+" This is concatenation" + " Thank goodness you can do this. (I came from Python background)");
		System.out.println(""+Byte+Short+Int+Double+Long+Float+Char+Boolean);
		
		Test1.StringBufferExample();

	}
	
}

