package tutorial39;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class TryCatchDemo2 {


	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
		
			FileReader fr = new FileReader(file);}
			
		catch (FileNotFoundException e) {
			System.out.println("Try and catch example");
			e.printStackTrace();
			
		}
		
		
	}

}