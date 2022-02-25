package be.intecbrussel;

public class BelgianMalinois extends Wilddog{
     private boolean dangerous;
     private double maxRunningSpeed;
	public boolean getDangerous() {
		return dangerous;
	}
	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}
	public double getMaxRunningSpeed() {
		return maxRunningSpeed;
	}
	public void setMaxRunningSpeed(double maxRunningSpeed) {
		this.maxRunningSpeed = maxRunningSpeed;
	}
     
	public void defend() {
		System.out.println("Belgian Malinois is defending ");
	}
	public void attack() {
		System.out.println("Belgian Malinois is attacking");
	}
}
