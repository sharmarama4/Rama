package be.intecbrussel1;

public class Sort {

	public static void sort(int[] numbers) {
		// TODO Auto-generated method stub
  

	    int [] marks= {45,12,65};
	  int l= marks.length;
	  int n=Math.floorDiv(l, 2);
	  int temp;
	  for (int i=0;i<n;i++) {
		  temp= marks[i];
		 marks[i]=marks[l-1-i];
		  marks[l-1-i]=temp;
		  
	  }
		for(int element:marks) {
			System.out.println(element+" ");
		}
		
		
		
		
		
	}

}
