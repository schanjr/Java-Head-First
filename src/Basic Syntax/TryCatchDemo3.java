package tutorial40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		Test test = new Test();
		
		
		//Normal try and catch error
		
		/*try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// Try Multi Catch Exceptions
		
		/*try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/*try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			test.input();
		} catch (FileNotFoundException e) {            //Notice that FileNotFoundException. This is because IOException is a parent class. 
			// TODO Auto-generated catch block		   //Must handle exceptions in the right order. s
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
