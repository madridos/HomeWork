package ptoject55;

public class Car {

	String model;
	String color;
	float price ;
	int year;
	boolean confortable;
	
	public Car() {
	
	System.out.println("car is the most used transportation nowadays");
	}

	public Car(String Model ) {
	
	this.model = Model;
	
	System.out.println(" the most expensive car int the world is called "+this.model);
	}
	
	public  void chooseColor(String Color) {
	  this.color = Color;
	 
	    System.out.println("this is my favorite color "+ color);
	    int carSeries=4;
	    String carColor;
	switch (carSeries) {
	case 1:
		carColor="White";
		System.out.println("this color is expensive");
	break;
	case 2:
		carColor="Black";
		System.out.println("this color gets dirty easily");
		break;
	case 3: 
		carColor="Red";
		System.out.println("this color is attractive");
		break;
		default: 
		        carColor = "unavailable color";
	    break;
	    }
	
	    System.out.println("color selected: "+carColor);
	
	}

	public static void main(String[] args) {
		
		Car car = new Car ();
		Car car1 = new Car ( "bugatti");
		car1.chooseColor("white");
	}
	
	
	
	
	
}