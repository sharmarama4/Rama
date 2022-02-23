package be.intecbrussel;

import java.util.Scanner;

public class loopsopdrcht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        
		int i=1;
		while(i<=4) {
			if(4/20==i) {
			System.out.println("plant get the" +i+"Glass of water ");
			break;
			}
		i++;
		}
		System.out.println();
		while(i<=200) {
			if(200/20==i) {			
			System.out.println("Every plant get the "+i+"schpjes of water");
			break;
		}
		i++;
		}
		System.out.println();
		
		int seizon; 
	   Scanner kbd=new Scanner(System.in);
	   System.out.println("Enter the seizon\n");
	    seizon=kbd.nextInt();
		switch(seizon) {
		case 1:
			System.out.println("Winter");
		break;
		case 2:
			System.out.println("lente en Herfst");
			break;
		case 3:
		  System.out.println("Zomer");
	   default:
		System.out.println("Invalid seizon");
		}
	   System.out.println();
		for(int j=1;j<=24;j++) { 
			if (j==6||j==12||j==18||j==24) { 
		System.out.println("Give the water");
			continue;
			}
     System.out.println(j);
	
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

}
