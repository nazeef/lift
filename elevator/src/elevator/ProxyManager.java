package elevator;

public class ProxyManager {
     Elevator elev;
     
     ProxyManager(){
    	 elev=new Elevator();
     }
     
     public void up(Integer flrNo){
    	 elev.up(flrNo);
     }
     
     public void down(Integer flrNo) {
    	 elev.down(flrNo);
     }
     
     public int getFlrNo() {
 		return elev.getFlrNo();
 	}
}
