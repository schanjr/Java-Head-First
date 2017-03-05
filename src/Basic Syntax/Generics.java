package tutorial54;

//http://stackoverflow.com/questions/5297978/calling-static-generic-methods

public class Generics {
	public static void main(String[] args) {

	}
}

class Foo<E>
{
    public static <E> Foo<E> createFoo()
    {
		return null;
        // ...
    }
}

class Bar<E>
{
    private Foo<E> member;

    public Bar()
    {
        member = Foo.createFoo();
    }
}