package tutorial;

import java.util.LinkedList;
import java.util.Arrays;

public class ArraysCreate {
	
	public static void main(String[] args){
		//int value = 1;
		String[] values = new String[3];
		//Can also be int[] values=new int[3]
		
		//first way of setting and accessing arrays
		values[0]="1";
		values[1]="12.31.23.123";
		values[2]="hi";
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);}
		
		//second way of setting and accessing arrays - probably better 
		String[] mary={"Mary","had","a","disasociative disorder"};
		for(String iterator: mary) {
			System.out.println(iterator);}
		
		//Declaration of Matrix example
		String[][] john={{"This", "is", "the", "first", "row", "-------"},{"This", "is", "the", "second", "row"}};
		
		//enchanced for loop
		for(String[] row_iter: john){
			for(String col_iter: row_iter) {
				System.out.println(col_iter);
			}
				}
		
		LinkedList ll = new LinkedList(Arrays.asList(john));
		for(int i = 0; i<ll.size(); i++){
			System.out.println(ll.get(i));
		}
		
	}
}

