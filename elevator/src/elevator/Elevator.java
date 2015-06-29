package elevator;

public class Elevator {
    Floor flr;
    Button btn;
    Door door;
    
    
    Elevator(){
    	flr=new Floor();
    	btn=new Button();
    	flr.setFlrNo(0);
    	door=new Door();
    }
    
	public void up(Integer flrNo) {
		System.out.println("Moving up...");
		btn.buttonpress(flrNo);
		flr.setFlrNo(flrNo);
		System.out.println("Lift stops at floor no: "+flrNo);
		door.opening();
		System.out.println("Person get in/out...");
		door.closing();
	}
	
	public void down(Integer flrNo) {
		System.out.println("Moving down...");
		btn.buttonpress(flrNo);
		flr.setFlrNo(flrNo);
		System.out.println("Lift stops at floor no: "+flrNo);
		door.opening();
		System.out.println("Person get in/out...");
		door.closing();
	}
}
