package ptoject55;

public class Computer {

	String origineCountry;
	String creator;
	int year;
	double price;

	public Computer() {

		System.out.println("computer has changed the world and nowaday everything is based on it ");
	}

	public Computer(String Creator, String OrigineCountry) {
		this.origineCountry = OrigineCountry;
		this.creator = Creator;
		System.out.println(creator + " was the creator of computer,and he is from " + origineCountry);
	}

	public int madeYear(int Year) {

		this.year = Year;
		System.out.println("computer was invented in " + year);
		return year;
	}

public static void salePrice(double Price) {
        double price=Price;
        System.out.println(price);
	 double a =500.5;
	
	for(a=0;a<3;a++) {
		
			
	}
	
}

	public static void main(String[] args) {

		Computer obj = new Computer();
		Computer obj1 = new Computer("Charles Babbage", "England");
		obj.madeYear(1622);
		obj1.salePrice(500.5);
	}
}