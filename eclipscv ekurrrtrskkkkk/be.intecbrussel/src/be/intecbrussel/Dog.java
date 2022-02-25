package be.intecbrussel;

public class Dog extends Wolf{

	private char size;
	
	
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size =size;
	}
	public void bark() {
		System.out.println("Wowwowwow");
	}
	public void sit() {
		System.out.println("Dog is sitting");
	}
	
	
}
