package tutorial51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {

	public static void main(String[] args) {

		try(FileInputStream fi = new FileInputStream("tutorial51.bin")){
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Person[] people = (Person[])oi.readObject();
			
			for(Person p: people){
				System.out.println(p);
			}
			
			
			@SuppressWarnings("unchecked")
			ArrayList<Person> peeps = (ArrayList<Person>) oi.readObject();
			for (Person p: peeps){
				System.out.println(p);
			}
			
			
			int objSize = oi.readInt();
			System.out.println(objSize);
			
			oi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
