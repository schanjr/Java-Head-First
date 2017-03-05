package tutorial48;

public enum Animals {
	CAT("Fergus"), DOG("Fido"), MOUSE("Furry");
	
	public String name;
	
	Animals(String name){
		this.name=name;
	}

	
	public String getName(){
		return name;
	}
	
	
	public String toString(){
		return "This animal is called "+this.name;
	}
	
	
	}
