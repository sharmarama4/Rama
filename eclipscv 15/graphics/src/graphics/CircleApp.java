package graphics;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This program is of circle");
		Circle cir1=new Circle();
		
		cir1.setx(-15);
		cir1.sety(-10);
		cir1.setRadius(-24);
		
		System.out.println("Radius of circle is :"+cir1.getRadius());
		System.out.printf("position: (%d,%d)",cir1.getx(),cir1.gety());
		System.out.println();
		System.out.println("The area is :"+cir1.getArea());
		System.out.println("The perimeter is :"+cir1.getPerimeter());
		System.out.println("Number of circle created:" + Circle.getCount());
		System.out.println("\n\nSecond Rectangle\n");
		
		Circle cir2=new Circle(36);
		cir2.setx(18);
		cir2.sety(16);
		System.out.println("Radius of circle is :"+cir2.getRadius());
		System.out.printf("position: (%d,%d)",cir2.getx(),cir2.gety());
		System.out.println();
		System.out.println("The area is :"+cir2.getArea());
		System.out.println("The perimeter is :"+cir2.getPerimeter());
        System.out.println("Number of circles created: " + Circle.getCount());
        System.out.println();      
		
        
        
		Circle cir3=new Circle(25,10,12);
		System.out.println("Radius of circle is :"+cir3.getRadius());
		System.out.printf("position: (%d,%d)",cir3.getx(),cir3.gety());
		System.out.println();
		System.out.println("The area is :"+cir3.getArea());
		System.out.println("The perimeter is :"+cir3.getPerimeter());
		System.out.println();      
		
		Circle cir4= new Circle(cir3);
		System.out.println("Radius of circle is :"+cir4.getRadius());
		System.out.printf("position: (%d,%d)",cir4.getx(),cir4.gety());
		System.out.println();
		System.out.println("The area is :"+cir4.getArea());
		System.out.println("The perimeter is :"+cir4.getPerimeter());
		System.out.println();
		System.out.println("A circle has: " + Circle.ANGLES + " angles.");
		System.out.println("Number of circles created: " + Circle.getCount());
		System.out.println();
		
		
		
		
		
		
		
	}

}
