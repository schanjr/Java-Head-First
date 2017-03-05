package tutorial45;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



//Tutorial on how to write to a file
public class WriteToFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\t_chanst\\Desktop\\Codes\\Eclipse\\Java-For-Fun\\src\\tutorial45","tut_45.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("Hello world.\n\r");
			bw.write("Wtf son howcome t his one is working??");
			bw.append("Appended.");
		}
		catch(IOException e){
			System.out.println("IO Exception error");
		}	
	}
}
