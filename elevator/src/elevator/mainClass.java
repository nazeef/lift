package elevator;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer flrNo,numFloorsMax=5,flrNoPerson=0;
		
        Elevator elev=new Elevator();
        Person p=new Person(3);
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Lift is on floor "+elev.flr.getFlrNo());
        
        //---------case 1
        
        System.out.println("Enter current floor number of person");
        flrNoPerson=scan.nextInt();
        
        System.out.println("Enter floor number to go to");
        flrNo=scan.nextInt();
        
        
        
        if(flrNo>flrNoPerson && flrNo<=numFloorsMax){
        	//press button
        	elev.up(flrNoPerson);
        	
        }
        else if(flrNo<flrNoPerson && flrNo>0){
        	//press button
        	elev.down(flrNoPerson);
        }
        
        
        if(flrNo>elev.flr.getFlrNo() && flrNo<=numFloorsMax){
        	//press button
        	elev.up(flrNo);
        }
        else if(flrNo<elev.flr.getFlrNo() && flrNo>0){
        	//press button
        	elev.down(flrNo);
        }
        /*
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
        */
	}

}
