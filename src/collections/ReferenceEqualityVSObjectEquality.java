package collections;

import java.util.Map;



public class ReferenceEqualityVSObjectEquality {

	public static void main(String[] args) {
		String test1 = "Hi"; 
		String test2 = "Hi";
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		/*Outputs "2337" for both because they are on stack together?
		*/
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		
		System.out.println(p1.returnHash());
		System.out.println(p2.returnHash());
		
		
		Map m;
		
		
	}

	static String contains(String str){
		return (str.contains("A")) ? "String Contains A": (str.contains("B")) ? "String Contains B" : "String Doesn't Contain A or B";
	}
	
	
}

	
	


class Person1{
	int returnHash(){
		return hashCode();
	}
}

class ModifiedEqualsHash{
	String id,name;
	ModifiedEqualsHash(){
		this.id=id;
		this.name=name;
	}
}