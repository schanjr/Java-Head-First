package tutorial39;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


/*Tutorial on handling exceptions
 * There are generally two ways to handle exceptions. 
 * 1. Throws 
 * 2. try/catch/throw
*/



public class TryCatchDemo {
//The Throws example simply throws an out of the box stored Exception handler
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("tests.txt");
		FileReader fr = new FileReader(file);

	}
}
