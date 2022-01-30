package evenOddusingForloop;

import java.util.Scanner;

public class EvenOddUsingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
 Scanner keyboard= new Scanner(System.in);
 System.out.println( "Enter all even and odd until :");
 int number=keyboard.nextInt();
  System.out.println("Even numbers from 1 to"+ number+"are:\n"); 
  for(a=1;a<=number;a++) {
	if(a%2==0)    
	{
	System.out.println(a+"\n");	
	}
	
  }
	System.out.println("Odd numbers from 1 to"+number+"are:\n");  
	for(a=1;a<=number;a++) {
	if(a%2==1) {	
		System.out.println(a+"\n");
		
	}
  }
  
  }
 
 
	}


