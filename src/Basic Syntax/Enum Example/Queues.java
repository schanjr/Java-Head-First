package tutorial62;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		Queue<Integer> qs= new ArrayBlockingQueue<Integer>(5);
		
		qs.add(1);
		qs.add(2);
		qs.add(3);
		qs.add(4);
		qs.add(5);
		
/*		try{
			qs.add(123);
		}
		
		catch (IllegalStateException e) {
			System.out.println("Exception encountered, added too many elements.");
			e.printStackTrace();
		}*/
		
		System.out.println(qs.peek()); //Just looks at the head of the queue
		System.out.println(qs.poll()); //Peeks at the head of the queue and then removing it;
		
	
		//Let's try to empty the queue
		qs.remove();qs.remove();qs.remove();qs.remove();
		
		for(Integer q: qs){
			System.out.println("Printing from the loop: "+q);
		}
		
		qs.remove(); //Throws error
		
	}

}
