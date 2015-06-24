package elevator;

public class Button {
	int butNo;
	
	public void pressButton(int butNo){
		this.butNo = butNo;
	}
	
	public void buttonpress(int butNo){
		System.out.println(" Button "+butNo+" has been Pressed");
	}
	
}
