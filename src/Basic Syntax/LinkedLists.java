package tutorial55;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/*LinkedList and ArrayList are two different implementations of the List interface. LinkedList implements it with a doubly-linked list. ArrayList implements it with a dynamically resizing array.

 As with standard linked list and array operations, the various methods will have different algorithmic runtimes.

 For LinkedList<E>

 get(int index) is O(n)
 add(E element) is O(1)
 add(int index, E element) is O(n)
 remove(int index) is O(n)
 Iterator.remove() is O(1) <--- main benefit of LinkedList<E>
 ListIterator.add(E element) is O(1) <--- main benefit of LinkedList<E>
 For ArrayList<E>

 get(int index) is O(1) <--- main benefit of ArrayList<E>
 add(E element) is O(1) amortized, but O(n) worst-case since the array must be resized and copied
 add(int index, E element) is O(n - index) amortized, but O(n) worst-case (as above)
 remove(int index) is O(n - index) (i.e. removing last is O(1))
 Iterator.remove() is O(n - index)
 ListIterator.add(E element) is O(n - index)
 LinkedList<E> allows for constant-time insertions or removals using iterators, but only sequential access of elements. In other words, you can walk the list forwards or backwards, but finding a position in the list takes time proportional to the size of the list.

 ArrayList<E>, on the other hand, allow fast random read access, so you can grab any element in constant time. But adding or removing from anywhere but the end requires shifting all the latter elements over, either to make an opening or fill the gap. Also, if you add more elements than the capacity of the underlying array, a new array (1.5 times the size) is allocated, and the old array is copied to the new one, so adding to an ArrayList is O(n) in the worst case but constant on average.

 So depending on the operations you intend to do, you should choose the implementations accordingly. Iterating over either kind of List is practically equally cheap. (Iterating over an ArrayList is technically faster, but unless you're doing something really performance-sensitive, you shouldn't worry about this -- they're both constants.)

 The main benefits of using a LinkedList arise when you re-use existing iterators to insert and remove elements. These operations can then be done in O(1) by changing the list locally only. In an array list, the remainder of the array needs to be moved (i.e. copied). On the other side, seeking in a LinkedList means following the links in O(n), whereas in an ArrayList the desired position can be computed mathematically and accessed in O(1).

 Also, if you have large lists, keep in mind that memory usage is also different. Each element of a LinkedList has more overhead since pointers to the next and previous elements are also stored. ArrayLists don't have this overhead. However, ArrayLists take up as much memory as is allocated for the capacity, regardless of whether elements have actually been added.

 The default initial capacity of an ArrayList is pretty small (10 from Java 1.4 - 1.7). But since the underlying implementation is an array, the array must be resized if you add a lot of elements. To avoid the high cost of resizing when you know you're going to add a lot of elements, construct the ArrayList with a higher initial capacity.

 It's worth noting that Vector also implements the List interface and is almost identical to ArrayList. The difference is that Vector is synchronized, so it is thread-safe. Because of this, it is also slightly slower than ArrayList. So as far as I understand, most Java programmers avoid Vector in favor of ArrayList since they will probably synchronize explicitly anyway if they care about that.
 */
public class LinkedLists {

	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		LinkedList<Integer> LL = new LinkedList<Integer>();
		
		//doTimings("ArrayList", AL);
		//doTimings("LinkedList", LL);
		
		for(int i=0; i<1E5; i++){
			LL.add(i);
		}
		System.out.println(LL.listIterator(0));
		
		
	}
	
	//Wrong way to do the comparisons by the way
	private static void doTimings(String type, List<Integer> list) {
		// Adding Items
		long start = System.currentTimeMillis();
		for (int z = 0; z < 10; z++) // Creating 10 iterations for better
										// results
		{
			for (int i = 0; i < 1E5; i++) {
				list.add(i);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding items to the end of list for: " + type + "takes: "+ (end-start)+ "ms.");
		//Adding items to the middle of the list
		long start1 = System.currentTimeMillis();
		int size1=(list.size()/2);
		for(int i=0; i<1E3; i++){
			list.add(size1,i);
		}
		long end1= System.currentTimeMillis();
		System.out.println("Adding items middle of the list for: " + type + "takes: "+ (end1-start1)+ "ms.");
		//Removing items from the middle of the list
		long start2 = System.currentTimeMillis();
		int size2=(list.size()/2);
		for(int i=0; i<1E3; i++){
			list.remove(size2);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("Removing items in middle of the list for: " + type + "takes: "+ (end2-start2)+ "ms.");
	}
	
	
	
	
}
