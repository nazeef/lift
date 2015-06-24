package elevator;

public class Floor {
	
    int flrNo;

	public int getFlrNo() {
		return flrNo;
	}

	public void setFlrNo(int flrNo) {
		this.flrNo = flrNo;
	}
	
	public void up() {
		this.flrNo++;
	}
	
	public void down() {
		this.flrNo--;
	}
             
}
