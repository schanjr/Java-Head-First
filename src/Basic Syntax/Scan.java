package tutorial2;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input something\n");
		//String nextLine = scan.nextLine();

		System.out.println("You have just typed: "+scan.next());
	}
}
