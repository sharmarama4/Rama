package be.intecbrussel;

import java.util.Arrays;

public class Opdrachtarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		int [] studentsPoints= {1,5,6,-9,77,110,-4,3,10,2};
		System.out.println(Arrays.toString(studentsPoints));
		for(int i= 0; i<studentsPoints.length;i++) {
			if(studentsPoints[i]>10) {
				studentsPoints[i]/=11;	
			}
			System.out.println(studentsPoints[i]);
			System.out.println();
		}
		for(int i= 0; i<studentsPoints.length;i++) {
		if(studentsPoints[i]<0) {
			studentsPoints[i]=-studentsPoints[i];
		}
		System.out.println(studentsPoints[i]);
	}
		System.out.println();
		for (int i=0; i<studentsPoints.length;i++) {
			if (studentsPoints[i]<3) {
				studentsPoints[i]*=3;	
			}
			System.out.println(studentsPoints[i]);	
		}
		System.out.println();
		 
		
	}
}
