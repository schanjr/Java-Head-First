package tutorial49;

public class Recursions {

	public static void main(String[] args) {
		int val=4;
		System.out.println(factorial(val));

	}

	public static int factorial(int val) {
		System.out.println(val);
		if (val == 1) {
			return val;
		} else {
			return factorial(val - 1) * val;
		}

	}
}
