package tutorial33;





class Machine {
	public void start(){
		System.out.println("Machine has started");
	}
}


//Interface just holds empty methods names, but doesn't do anything. 
interface Plant {
	public void grow();
}


/*Abstract classes contains abstract methods. Abstract methods are expected to be extended(inherited) by other classes that will use it. 
This is a modelling feature in scenarios where you're certain some methods will exist in the child classes, but the implementation needs to 
be customized. For example there could be an abstract machine or plant, but the child class will define the method based on what kind of machine 
or plant it is. http://www.javacoffeebreak.com/faq/faq0084.html
*/
public abstract class AbstractClassSimpleExample {
	public static void main(String[] args){
		
		//Notice we can create a method or redefine it 
		Machine machine1 = new Machine(){
			@Override public void start() {
				System.out.println("Snapshotted camera");}
				};
					
		machine1.start();	
		
		Plant plant1 = new Plant(){
			public void grow(){
				System.out.println("Plant is growing");}
			};
		
			plant1.grow();
		
	}
}
