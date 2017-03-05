package tutorial60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class LengthStringComparator implements Comparator<String>{
@Override
public int compare(String o1, String o2) {
	int len1=o1.length();
	int len2=o2.length();
	
	if(len1>len2){
		return 1;
	}
	else if (len1<len2){
		return -1;
	}
	else{
		return 0;
	}
}}


class AlphabeticalDescCpr implements Comparator<String>{
	public int compare(String o1, String o2){
		//System.out.println(-o1.compareTo(o2));
		return -o1.compareTo(o2);
	}
}



public class SortingLists {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("dragons");
		animals.add("mouse");
		animals.add("elephants");
		animals.add("snake");
		animals.add("kk");
		
		//Sort Alphabetically
		Collections.sort(animals); //Same applies to integers
		System.out.println("Alphabetically: "+animals);
		//Sort by String Lengths
		Collections.sort(animals, new LengthStringComparator());
		System.out.println("String's Length: "+animals);
		
		//Sort Alphabethically DESC --Check out! This is really Cool!
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		System.out.println("Alpha DESC: "+animals);
		
		
	}

}
