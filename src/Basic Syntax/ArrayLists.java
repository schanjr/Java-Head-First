
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayLists {

	static ArrayList<Double> al1 = new ArrayList<Double>();
	static ArrayList<String> al2 = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// couple of ways to create ArrayList
		Array1Gen(50); // Generate random list of numbers
		Array2Gen(50); // Generate random list of Strings
		System.out.print(al1 + "\n" + al2 + "\n");
		
		Collections.sort(al1, Collections.reverseOrder());
		for (int i=0; i!=3; i++){
		    al1.remove(i);
		    System.out.println("Objects removed are: "+al1.get(i));
		    }
		System.out.println("Demonstrates ArrayList are randomly accessed.");
		System.out.print(al1.size());
		
		

	}

	static void Array1Gen(int counts) {

		for (int i = 0; i <= counts; i++) {
			al1.add(Math.random());
		}

	}

	static void Array2Gen(int counts) {
		for (int i = 0; i <= counts; i++) {
			al2.add((String) generateRandomWord(counts));
		}
	}

	static String generateRandomWord(int wordLength) {
		Random r = new Random(); // Intialize a Random Number Generator with
									// SysTime as the seed
		StringBuilder sb = new StringBuilder(wordLength);
		for (int i = 0; i < wordLength; i++) { // For each letter in the word
			char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter
															// between a and z
			sb.append(tmp); // Add it to the String
		}
		return sb.toString();
	}

}
