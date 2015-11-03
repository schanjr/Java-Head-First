package interestingLitoPrograms;

import java.util.Scanner;

public class mathRandom{
	public static void main (String [] Args) {
		System.out.println("Please input your maximum number to generate to.");
		Integer max;
		Scanner userInput = new Scanner(System.in);
		max=userInput.nextInt(); //only scans for int
		System.out.println("Generated from 0 to "+(max)+": "+(int)(Math.random()*(max+1)));
		userInput.close();
		System.out.println("Program ends now.");
	}
}