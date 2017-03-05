package tutorial;

class Frog {

	private int id;
	private String name;
	
	//This is a constructor
	public Frog(int id, String name){
		this.id=id;
		this.name=name;}
	
	public String toString() {

		return String.format("%d: %s", id, name);

		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(": ").append(name);
		 * return sb.toString();*/
	}
}


public class ObjectMethods {
	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Froggy1");
		Frog frog13 = new Frog(13, "Curious George");
		System.out.println(frog1);
		System.out.println(frog13);
	
	}

}
