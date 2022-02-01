package myapp;

import java.util.Scanner;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String dag;
		int totaalDags;
	Scanner r= new Scanner(System.in);	
		String []dags= {"monday","Tuesday","wednesday","Thursday","Friday"};
		
	
	System.out.println("Fill the start dag:");
		 dag = r.nextLine();
for(int i=1; i<dags.length;i++) {
	System.out.println(dags[i]);}
		  
System.out.println("Fill the stop dag");
        dag=r.nextLine();
for(int i=1; i<dags.length;i++){
	System.out.println(dags[i]);}
	
	}
}
 


