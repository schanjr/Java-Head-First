package tutorial66;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
 
public class ComplexDataTypeSlicing {
 
    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };
 
    public static String[][] drivers = { 
        { "Fred", "Sue", "Pete" },
            { "Sue", "Richard", "Bob", "Fred" }, 
            { "Pete", "Mary", "Bob" }, };
 
    public static void main(String[] args) {
    	Map<String, Set<String>> personnels = new HashMap<String, Set<String>>();
    	
    	for(int i=0; i<vehicles.length;i++){
    		String veh = vehicles[i];
    		String driv[] = drivers[i];
    		Set<String> driverSet = new LinkedHashSet<String>();
    		for(String d: driv){
    			driverSet.add(d);
    		}
    	
    		personnels.put(veh, driverSet);
    	
    	}
    	System.out.println(personnels.get("ambulance")); //To get all drivers associated with ambulance
    	for(String keys: personnels.keySet()){
    		System.out.println(keys+":"+personnels.get(keys));
    	}
    }
    }
    