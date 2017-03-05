package tutorial44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//beautiful way to open a file. Though still much more tedious when compared to Python. 

public class App1 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\t_chanst\\Desktop\\Codes\\Eclipse\\Java-For-Fun\\src\\tutorial44","test.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't find the file " + file.toString());
			System.out.println("Current directory has " + System.getProperty("user.dir"));
		} catch (IOException e) {
			System.out.println("Unable to read the darn file for some reason "
					+ file.toString());
		}
		finally {
			System.out.println("Printing from the 'finally' block");
		}
		
	}
}
