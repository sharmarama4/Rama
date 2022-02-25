package be.intecbrussel;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Wolf l=new Wolf();
		  
		 l.makeNoise();
		 l.setName("Harry");
		 l.setLifespan(1989);
		  System.out.println("The name of the wolf is " +l.getName());
		  System.out.println("The lifespan is"+l.getLifespan()); 
		  System.out.println("The wolf makes "+l.getMakeNoise("Wooo")) ;
		  
		
		Dog akita=new Dog();
		
	  akita.bark();
	  akita.sit();
	  akita.setSize('m');
	  System.out.println("The size of dog is "+akita.getSize());
	  System.out.println();
	  
	  Homelydog h=new Homelydog();
	  h.setCoat('L');
	  System.out.println( "Homelydog has"+ h.getCoat()+"coat");
	  Bergamasco b=new Bergamasco();
	  b.setHairLength(12);
	  b.setMaxRunningSpeed(54);
	  b.kiss();
	  System.out.println("HairLength is = "+b.getHairLength());
	  System.out.println("Running Speed is= "+b.getMaxRunningSpeed());
	  System.out.println();
	  
	  Wilddog w=new Wilddog();
	  w.hunt();
	  w.setSize('L');
	 System.out.println( "The bark time of wilddog is"+ w.getBarkTimes(10));
	  System.out.println();
	  
	  BelgianMalinois m=new BelgianMalinois ();
	  m.defend();
	  m.attack();
	  m.setMaxRunningSpeed(42);
	  m.setDangerous(false);
	  System.out.println(m.getMaxRunningSpeed());
	  System.out.println(m.getDangerous());
	  System.out.println();
	  
	  Akita1 a=new Akita1();
	  a.laydown();
	  a.sit();
	  a.setGender('m');
	  a.sing();
	  
	  System.out.println("The gender is ="+a.getGender());
	  Affenpinscher f=new Affenpinscher();
	  f.dance();
	  f.setColor("White");
	  f.setNickname("Germen ");
	  System.out.println("He has "+f.getNickname()+"nickname");
	  System.out.println("The color is "+f.getColor());
	  System.out.println();
	 
	  Pekingese p=new  Pekingese() ;
	  p.play();
	  p.setHairLength(45);
	  System.out.println("The hair length of pekingse is "+p.getHairLength());
	  System.out.println();
	 
	  
	}

}
