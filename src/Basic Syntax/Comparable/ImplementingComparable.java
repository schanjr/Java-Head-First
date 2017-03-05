package tutorial61;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;




/*http://www.javacodegeeks.com/2013/03/difference-between-comparator-and-comparable-in-java.html
http://stackoverflow.com/questions/4108604/java-comparable-vs-comparator
http://www.javapractices.com/topic/TopicAction.do?Id=10
*/
class Person implements Comparable<Person> {
    private String name;
     
    public Person(String name) {
        this.name = name;
    }
     
    public String toString() {
        return name;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        final Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();
        System.out.println("Len1: " + name + len1);
        System.out.println("Len2: " + person.name + len2);
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
    }
}
 
public class ImplementingComparable {
 
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();
         
        addElements(list);
        addElements(set);
         
        Collections.sort(list);
         
        showElements(list);
        System.out.println();
        showElements(set);
        System.out.println();
    }
     
    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));
    }
     
    private static void showElements(Collection<Person> col) {
        for(Person element: col) {
            System.out.println(element);
        }
    }
 
}
