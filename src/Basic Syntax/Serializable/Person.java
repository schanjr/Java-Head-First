package tutorial51;

import java.io.Serializable;

public class Person implements Serializable {
	int id;
	String name;
	
	public Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override   //Seems override is not mandatory if trying to overwrite a method. But helps the developer checks if a real inheritted method was really overriden.
	//Try misspelling the following method name. This shows the trick.
	public String toString(){
		return "["+this.id +": "+ this.name+ "]";
	}
	
	
	
}
