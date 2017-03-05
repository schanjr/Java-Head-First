package tutorial32;

import java.util.ArrayList;

/*
To use ArrayList, we need to specify what kind of object is going to be stored to it. Such as ArrayList<String> = new Arraylist();
Primitive types are not available with ArrayList. If you'd like to use wild cards, use the question mark as show below.
*/
class Machine {
	@Override 
	public String toString(){
		return "I am a machine";
	}
}
class Camera extends Machine{
	@Override 
	public String toString(){
		return "I am a camera";
	}
	
}


public class ArrayListExamples {
	public static void main(String[] args){
	
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());

		showList(list1);
	}
	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value : list) {
			System.out.println(value);
			
		}}
	public static void showList2(ArrayList<? super Camera> list) {
		for(Object value : list) {
			System.out.println(value);
			
		}}
	
	
	}
