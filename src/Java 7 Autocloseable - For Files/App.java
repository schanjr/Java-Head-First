package tutorial44;


/*
 * Demo of a new feature in JAVA 7 - "try with resources" (Not sure why it is called that). "Try with Autoclose" might be more appropriate
How it works is a new feature is added with the Try/Catch java syntax. Within the "Try" Round Curly Brackets, now it automatically calls the 
close method on whatever object it has. 
*/

class Temp implements AutoCloseable{
@Override
public void close() throws Exception {
		System.out.println("Close method is implemented. Application is closing now.");	
		throw new Exception("Oh no, I threw an exception!"); //Check out we don't need to create an entire new "Exception" object here. Normally you would do this:
		//Exception exception = new Exception("Oops!"); throw exception;
	}
		
public void out() {
	System.out.println("Calling from the 'out' method");
}
}


class Temp1 {
	public void out() {
		System.out.println("Calling from Temp1. This does not have the close method");
	}
}

public class App {

	public static void main(String[] args) {
	
		try(Temp t = new Temp()) {
			t.out();
		//try (Temp1 t = new Temp1()){t.out();} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Printed from the 'finally' block");
		}
	}
}

//Now that you see how "Try with resources" work, go to the App1.java and check out how to really open and close a file!

