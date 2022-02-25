package be.intecbrussel;

public class Affenpinscher extends Homelydog {
 private String color;
 private String nickname;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
 public void dance() {
	 System.out.println("Affenspinscher is dancing");
 }
}
