package be.intecbrussel;

public class Wilddog extends Dog {
 private char size='L';

public char getSize() {
	return size;
}

public void setSize(char size) {
	this.size = size;
}
 public void hunt() {
	 System.out.println("Wildog is hunting");
 }
 
 
public int getBarkTimes(int times) {
	return times;
}

}

 
