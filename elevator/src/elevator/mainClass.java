package elevator;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer flrNo;
		
        Elevator elev=new Elevator();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Lift is on floor "+elev.flr.getFlrNo());
        
        //---------case 1
        System.out.println("Enter floor number");
        flrNo=scan.nextInt();
        
        if(flrNo>elev.flr.getFlrNo() && flrNo<20){
        	//press button
        	elev.up(flrNo);
        }
        else if(flrNo<elev.flr.getFlrNo() && flrNo>0){
        	//press button
        	elev.down(flrNo);
        }
        
        //------case 2
        System.out.println("Enter floor number");
        flrNo=scan.nextInt();
        
        if(flrNo>elev.flr.getFlrNo() && flrNo<20){
        	//press button
        	elev.up(flrNo);
        }
        else if(flrNo<elev.flr.getFlrNo() && flrNo>0){
        	//press button
        	elev.down(flrNo);
        }
        
        
        //-----case 3
        System.out.println("Enter floor number");
        flrNo=scan.nextInt();
        
        if(flrNo>elev.flr.getFlrNo() && flrNo<20){
        	//press button
        	elev.up(flrNo);
        }
        else if(flrNo<elev.flr.getFlrNo() && flrNo>0){
        	//press button
        	elev.down(flrNo);
        }
        
	}

}
