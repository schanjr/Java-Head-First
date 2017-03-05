package tutorial59;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "ID: " + this.id + " Name: " + this.name + "\nThe Hashcode is: "
				+ name.hashCode();
		// return "The Hashcode is: " + name.hashCode();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class StoreObjectsInHashAndSets {

	public static void main(String[] args) {
		Person p1 = new Person(12, "Stanley"); // Base
		Person p2 = new Person(13, "Stanley"); // Values are the same
		Person p3 = new Person(12, "Renee"); // Keys are the same
		Person p4 = new Person(14, "John"); // Everything completely different

		// System.out.println(p1);

		Map<Person, Integer> LHM = new LinkedHashMap<Person, Integer>();
		Set<Person> LHS = new LinkedHashSet<Person>();

		LHM.put(p1, 1);
		LHM.put(p2, 2);
		LHM.put(p3, 3);
		LHM.put(p4, 4);

		System.out.println(LHM);

		LHS.add(p1);
		LHS.add(p2);
		LHS.add(p3);
		LHS.add(p4);

		System.out.println(LHS);

	}

}
