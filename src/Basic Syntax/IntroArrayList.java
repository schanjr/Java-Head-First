package tutorial30;

import java.util.ArrayList;



public class IntroArrayList {
	public static void main(String[] wtf) {
		
	////Modern Style Java 7 /////// 
	ArrayList<String> somelist = new ArrayList<>();
/*	Surrounded in the left and right array is called type parameterization. It declares exactly what type of data is able to store
	and what kind that cannot be stored. In the aove example, only String is able to be stored in this ArrayList. This is used for checking
	because typically making the ArrayList generic like "ArrayList<>" is unsafe. */
	
	//somelist.add(123);
	somelist.add("hello world");
	somelist.add("what in tarnation");
	somelist.add("whatsup doc");
	somelist.add("how are you doing?");
	System.out.println(somelist);
	
	int counter=0;
	//Found a new way to iterate through stuff
	for(String value: somelist){
		counter++;
		System.out.printf("%d: %s\n", counter,value);
	}
	
	
/*	Cannot iterate some things
	String hw = "Hello world, where adfdfasdf ";
	for(String value: hw){
		System.out.println(value);
	}*/
	}	
}
