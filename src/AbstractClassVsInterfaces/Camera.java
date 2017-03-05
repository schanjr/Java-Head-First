package tutorial42;

public class Camera extends Machine {

	@Override
	void start() {
		System.out.println("starting camera");

	}

	@Override
	void doSomething() {
		System.out.println("Snapping");
	}

	@Override
	void shutDown() {
		System.out.println("shutting down camera");
	}

}
