package tutorial57;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class SortedMaps {

	static Map<Integer,String> HM = new HashMap<Integer,String>();
	static Map<Integer,String> LHM = new LinkedHashMap<Integer,String>();
	static Map<Integer,String> TM = new TreeMap<Integer,String>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMaps don't have any particular order. Sometimes look like sort by key, but not guaranteed
		testMaps(HM);
		//LinkedHashMaps also known as Double Linked Hash Maps retains the order that was placed into the dictionary
		testMaps(LHM);
		//TreeMaps sorts dictionary by its natural order AKA Key.
		testMaps(TM);
	}
	
	public static void testMaps(Map<Integer,String> map){
		map.put(5, "Stanley");
		map.put(10, "Stanley");
		map.put(12, "Stanley");
		map.put(3, "Stanley");
		map.put(2, "Stanley");
		map.put(6, "Stanley");
		map.put(20, "Stanley");
		
		System.out.println(map);
		
	}

}
