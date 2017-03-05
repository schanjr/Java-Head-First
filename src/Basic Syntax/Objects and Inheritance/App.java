package tutorial;

public class App {
	public static void main(String[] args){
		Person p1 = new Person("bobby");
	//	^      ^    ^   ^
	//	Type  Name      Object
		
		String g = p1.greet();
		System.out.printf("%s my name is: %s", g, p1.name);
	}
}

//test