package tutorial;

public class Machine {
	public void start() {
		System.out.println("Machine has started");
	}
	
	public void stop() {
		System.out.println("Machine has stopped");
	}
	
	public String getMachine_name() {
		return machine_name;
	}

	public void setMachine_name(String machine_name) {
		this.machine_name = machine_name;
	}

	private String machine_name = "Ferrari";

}
