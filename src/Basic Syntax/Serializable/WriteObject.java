package tutorial51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/*
 Serializing means taking an object and turning it into a binary data. Deserializing means the opposite. Taking 
 opposite and turning it into object.*/

public class WriteObject {

	public static void main(String[] args) {
		Person[] people = { new Person(1, "Stan"), new Person(2, "Renee"),
				new Person(3, "Homerun") };

		try (FileOutputStream fs = new FileOutputStream("tutorial51.bin");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(people);

			ArrayList<Person> peeps = new ArrayList<Person>(
					Arrays.asList(people));

			os.writeObject(peeps);
			int peepsSize = peeps.size();
			os.writeInt(peepsSize);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
