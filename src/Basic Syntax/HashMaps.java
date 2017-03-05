package tutorial56;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps {

    public static void main(String[] args) {

	// Similar to dictionaries in python. Except in Java, Keys and values can be any kind of dictionary.
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(5, "Taking Key number five");
		HM.put(12, "Taking Key number twelve");
		System.out.println(HM);
		
		//Looping through HashMaps
		for(Entry<Integer, String> entry: HM.entrySet()){
			System.out.println("\n"+entry);
			
		}

    }	

}
