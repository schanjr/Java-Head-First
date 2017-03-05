package tutorial63;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iteratorsz {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Cat");
		ll.add("Dog");
		ll.add("Mouse");
		ll.add("Giraffes");
		ll.add("Dragons");
		
	
//		Modern way of iterating
		for(String items:ll){
			System.out.println("Iterating from the for loop: "+items);
		}
		
		//Old style of iterating
		
		Iterator<String> iter = ll.iterator(); //list iterator exists here as well. 
		while(iter.hasNext()){
			String item = iter.next();
			System.out.println("Iterating from old style: "+item);
			
		if(item=="Dog"){
			iter.remove();
			System.out.println(item+" Has been found and removed!");
		
		}
		}
		
		//Using the old style of iterating has some benefits. One of them is you're able to remove elements while iterating
		//The second benefit is you can add element while iterating, but this will need the List Iterator
		
		List<String> list = new ArrayList<String>();
		list.add("Catsss");
		list.add("Dogsss");
		list.add("Mouses");
		list.add("Dragons");
		
		ListIterator<String> ListIter = list.listIterator();
		//http://stackoverflow.com/questions/10977992/difference-between-iterator-and-listiterator
		
		
		
		
		
		
		
		
	}

}
