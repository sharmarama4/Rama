package be.intecbrussel;

import java.util.Scanner;

public class Peacecraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		Scanner kbd=new Scanner(System.in);
		System.out.println("Please enter a number ");
	     int num=kbd.nextInt();
	     System.out.println(num);
		 
		if (num==1) {
			System.out.println("Your password is Gorilla");
		}
		else if(num==2) {
			System.out.println("Your password is Gori ");	
		}
		else if(num==3) {
			System.out.println("Your paswoord is Harambe");
		}
		else {
			System.out.println("Don't try");
		}
		System.out.println();
		 
		
		}
	}


