package elevator;

public class Door {
	String type;
	
	public Door(String name){
		this.type = name;
	}
	
	public void opening() {
		System.out.println("Door Opening");
	}
	
	public void closing() {
		System.out.println("Door Closing");
	}
	
	public void jam() {
		System.out.println("Door Jam");
	}

}
