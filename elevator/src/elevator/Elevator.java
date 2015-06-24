package elevator;

public class Elevator {
    Floor flr;
    Button btn;
    
    Elevator(){
    	flr=new Floor();
    	btn=new Button();
    	flr.setFlrNo(0);
    }
    
	public void up(Integer flrNo) {
		System.out.println("Moving up...");
		btn.buttonpress(flrNo);
		flr.setFlrNo(flrNo);
	}
	
	public void down(Integer flrNo) {
		System.out.println("Moving down...");
		btn.buttonpress(flrNo);
		flr.setFlrNo(flrNo);
	}
}
