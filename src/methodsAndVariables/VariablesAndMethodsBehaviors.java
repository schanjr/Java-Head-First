package methodsAndVariables;
import java.math.BigDecimal;





public class VariablesAndMethodsBehaviors {
	private int size;  //<--(Lives in Heap)
	private static int countOfInstances; //		"Statics" Example #4  - This variable is shared among all instances that were created <--Lives in a class instead of Object (Lives in Stack?)
	private static final double pie; 	//		"Final" Example #1 - Final Variables must be assigned either in the class or...
	
	static{pie=3.141514123123123123;} //		"Final" Example #2 - Assigned in a static method. FYI, this is ran first before the constructor! //Lives on Stack! Not on Heap!
	
	public VariablesAndMethodsBehaviors(){
		countOfInstances++;   //				"Statics" Example #5 - This Constructor is invoked everytime an instance is created, so 
		size++;
	}

	public static void main(String[] args) {
		//System.out.println(size); 		"Statics" Example #1 Static Method cannot refer to non static variables
		//System.out.println(getSize()); 	"Statics" Example #2 Static Methods can't use non Static methods
		/*		
		VariablesAndMethodsBehaviors svn = new VariablesAndMethodsBehaviors();
		System.out.println(svn.getSize());  "Statics" Example #3 Different. Calling from Static Method to create an nonStatic Object, and then calling it. 
		*/
		VariablesAndMethodsBehaviors init1 = new VariablesAndMethodsBehaviors();
		VariablesAndMethodsBehaviors init2 = new VariablesAndMethodsBehaviors();
		VariablesAndMethodsBehaviors init3 = new VariablesAndMethodsBehaviors();
		System.out.println("Count of instances: "+countOfInstances);    // Guess how many number will come here? -Hint- How many times is the constructor loaded?
		System.out.println("Size: "+ init3.size);						// Guess how many number will come here? -Hint- Is this variable instance specific or class specific?
		
		// VariablesAndMethodsBehaviors.pie=3.13;  "Final" Example #3 - Not going to work because Final vars are constant. Once assigned value, cannot change it. 
		System.out.println(pie);
		
		
		System.out.println("Using NonStatic Method to call a static variable: "+init3.getCountInstances()); //"Statics" Example #6 
		
		init3.finalizeCountVar(countOfInstances);
		
		
		
		
	}
	public int getSize(){
		return size;
	}	

	public int getCountInstances(){
		return countOfInstances; 				//"Statics" Example #6 - Why does this compile? -Hint- Static methods can't call non static variables, but Non static variables can call static variables.
		                                
	}
	
	public void finalizeCountVar(final int count){
		System.out.println(count);
	}
	double r1 = Math.random();
	double pi=Math.PI;
}
	
	
	
