package be.intecbrussel;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float eng;
	float phy;
	float che;
	float math;
	float com;
	double total;
	double average;
	double percentage;
	Scanner k = new Scanner (System.in);
		
		System.out.println("Enter the number of English");
		eng = k.nextFloat();
		
		System.out.println("Enter the number of Physics");
		phy= k.nextFloat();
		
		System.out.println("Enter the number of Chemistry");
		che= k.nextFloat();
		System.out.println("Enter the number of Maths");
		math = k.nextFloat();
		
		System.out.println("Enter the number of Computers");
		com = k.nextFloat();
		
		// total,average and percentage of marks//
		 total=eng+phy+che+math+com;
		 average= (total/5.0);
		percentage= (total/500.0   )*100;
		
		System.out.println("The total marks of all subjects="+ total);
		System.out.println("The total average of all subjects = "+average);
		System.out.println("The total percentage of all subjects = "+ percentage);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
