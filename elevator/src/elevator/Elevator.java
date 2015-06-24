package elevator;

public class Elevator {
    Floor flr;
    
    Elevator(){
    	flr=new Floor();
    	flr.setFlrNo(0);
    }
    
	public void up() {
		flr.flrNo++;
	}
	
	public void down() {
		flr.flrNo--;
	}
}
