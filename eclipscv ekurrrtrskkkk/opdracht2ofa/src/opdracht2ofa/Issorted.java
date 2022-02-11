package opdracht2ofa;

import java.util.Arrays;
import java.util.Scanner;

public class Issorted {

	public static void main(String[] args) {
		
   int []a=new int[5];
   int[]a2=new int[5];
   Scanner kbd= new Scanner(System.in);
   System.out.print("Enter data in Arry 1");
   for(int i=0;i<a.length;i++) 
   {
	    a[i]=kbd.nextInt();
	    
   }
	
   
   System.out.print("Enter data in Arry 2");
   for(int i=0;i<a2.length;i++)
   {
	    a2[i]=kbd.nextInt();  
   }
   
	   boolean b= Arrays.equals(a, a2);
	   System.out.println("Are they both equals :" +b);
	    
	    
	    
	}
	}

