package be.intecbrussel;

public class Shoepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
 String [] brand = {"nike","timberLand","balenciaga","nike2","timberLand2","balenciaga2","nike3","timberLand3","balenciaga3"}; 

   boolean[]complete= {true,false};
   int[]size= {41,41,45,42,39,45,41,37};
		 
  String[] color= {"White","brown","black","white","black","black","black","yello","white"};
  Double [] price= {69.99,219.99,429.99,29.99,170.0,50.0,79.99,80.0,349.99};

		 
for (int i=0;i<size.length;i++) {
	
		if(size[i]==41) {
			System.out.println(size[i]);
		}
	}
System.out.println();
 for (int i=0; i<brand.length;i++) {
	for (int j=i+1;j<brand.length;j++) {
		if(brand[i]!=brand[j]) {
		
		}
		 System.out.println(brand[i]+" ");
	 }
 }
		 int sum=0;
	 
			
			for(int i =0;i<price.length;i++)	{
		sum+=price[i];
			}
			System.out.println(sum);
			}
	}
		 
		 
	 
 
	 
	
		 
	


