package testingapp;

import java.util.Scanner;

public class Testingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard=new Scanner(System.in);
		int startMinuut;
		int stopMinuut;
		int startUur;
		int stopUur;
		int totaalMinuute;
		int totaalUur;
		int totaalWerkDag;
		do {
			System.out.println("Enter the start minutes that you worked");
			startMinuut=keyboard.nextInt();
			
		}while(startMinuut<0||startMinuut>59);
		do {
			System.out.println("Enter the stop minutes of your work");
			stopMinuut=keyboard.nextInt();
		}while(stopMinuut<0|| stopMinuut>59);
		
		
			
		do {
			System.out.println("Enter the start hour that you work");
			startUur=keyboard.nextInt();
		}while(startUur<0||startUur>24);
			
		do {
			System.out.println("Enter the stop hour that you work");
		stopUur=keyboard.nextInt();
		}while(stopUur<0||stopUur>24);
		
		if (startUur<stopUur) {
			 totaalUur = startUur-stopUur;
		}else if(startUur>stopUur) {
			totaalUur=(startUur-startUur)+24;
			
		}else totaalUur=0;
		
		System.out.println("You have worked" +totaalUur+"hours");
		
		if(startMinuut<stopMinuut) {
			totaalMinuute=startMinuut-stopMinuut;
		}else if(startMinuut>stopMinuut) {
			totaalMinuute=(startMinuut-stopMinuut)+60;
		}else totaalMinuute=0;
			System.out.println("You have worked"+ totaalMinuute+ "minutes");
			
			System.out.println("Please fill in de number of day you started working.....!\n");	
		int days=keyboard.nextInt();
		
		switch( days){
	
		case 1: 
			System.out.println("Monday"+"[1]");
			
			
		case 2: 
			System.out.println("Tuesday" +"[2]");
			
			
		case 3: 
			System.out.println("Wednesday"  +"[3]");
		
		case 4: 
			System.out.println("Thursday" +"[4]");
		
		case 5: 
			System.out.println("Friday" +"[5]");
		
	     case 6: 
		     System.out.println("Saturday" +"[6]");
		
          case 7: 
	      System.out.println("Sunday" +"[7]");	  
		}  
		    
		
	}
}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	


