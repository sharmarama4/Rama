package graphics;

public class Circle {

	private  int radius;
	private int x;
	private int y;
	
	public static final int ANGLES;
	 private static int count;
	 
	 static {
		 ANGLES=0;
	 }
	 {
		System.out.println("We are creating an objet"); 
		count++;
	 }
	public Circle() {this(0);
		
	}
	
	
	
	public Circle(int radius) {
		this(radius,0,0);
	}
	public Circle(int radius, int x, int y) {
		setRadius(radius);
		setPosition(x,y);
	}
      public Circle (Circle c) {
    	setRadius(c.getRadius());	
      	setPosition(c.getx(),c.gety());
}	
      
   public void setx(int x) {
	   this.x=x;
	   this.x=(x<0)?-x:x;
	   
   }
  public int getx() {
	  return x;
  }
  public void sety(int y) {
	  this.y=y;
	  
	  this.y=(y<0)?-y:y;
  } 
  public int gety() {
	  return y;
  }
      
  public void setPosition(int x,int y) {
	  this.x=x;
	  this.y=y;
  }
 public void setRadius(int radius) {
	 this.radius=radius;
	 this.radius=(radius<0)?-radius:radius;
 }
  
 public int getRadius() {
	 return  this.radius;
 }

  public double getArea() {
	  return (3.14*this.radius*this.radius);
  }
  public double getPerimeter(){
	  return(2*3.14*this.radius);
  }
  public void grow(int d) {
	  this.radius*=Math.abs(radius*2*d);
	  
  }
  
  public static int getCount() {
	  return count;
  }
  
  
  
  
  
  
  
  
 
  
  
  
      
      
      
      
      
      
			
		}

