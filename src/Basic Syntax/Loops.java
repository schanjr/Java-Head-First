package tutorial2;
import java.util.Scanner;
import java.util.Random;

public class Loops {
	
	
	//While Loop Example
	public static void main(String[] args) {
		int Value = 0;
		// boolean Loopie=Value<20;
		System.out.println("Calling while loop...");
		while (Value < 5) {
			System.out.println("In 'While-Loop' value is:" + Value);
			Value = Value + 1;}
		System.out.println("Calling for loop...");
		Loops.main1(); //calling the main1 method.
		System.out.println("Calling do-while loops...");
		main2();
		
		
		}
	//For loop example
		public static void main1() {
		int Counter = 5;
		// boolean Loopie=Value<20;
		for (int i=0; i<5; ++i) {
			System.out.printf("Inside 'For' Loop. Value of 'i' is (%d) countdown is (%d) \n", i, Counter);
			Counter= Counter - 1;}
		}
	
		//Do While loop example
		public static void main2() {
		Random randomGenerator = new Random();	//Creates an instance of Random() object and assigns it to randomGenerator variable
		int range = 2;
		int randInt=randomGenerator.nextInt(range);
		Scanner scanner = new Scanner(System.in);
		int value;
		do {
			System.out.printf("Enter a number from 0 to %d", range);
			System.out.println("");
			value = scanner.nextInt();
		}
			
		//System.out.println("stucked in infinity loop");
		while(value!=randInt);
		scanner.close();
		System.out.printf("Random number guess was correct: %d", randInt);
		}
		
	}

