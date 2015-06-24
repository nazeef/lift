package elevator;

public class Elevator {
    Floor flr;
    
    Elevator(){
    	flr=new Floor();
    	flr.setFlrNo(0);
    }
    
	public void up() {
		flr.setFlrNo(flr.getFlrNo()+1);
	}
	
	public void down() {
		flr.setFlrNo(flr.getFlrNo()-1);
	}
}
