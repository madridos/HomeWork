package ptoject55;

public class Mobile {

	String name;
	String model;
	int memory;
	double price;

	public Mobile() {
		System.out.println("hello everyone let me introduce you this new phone");

	}

	public Mobile(String Name, String Model, int Memory, double Price) {

		this.name = Name;
		this.model = Model;
		this.memory = Memory;
		this.price = Price;
		System.out.println("this is a new "+ name + model + " with "+memory+ " GG only at "+ price+ "$." );
	}

	public  void  newPhone(String Name, String Model, int Memory, double Price) {
		
		name = Name;
		model = Model;
		memory = Memory;
		price = Price;
		System.out.println("this is a new "+ name +" "+ model + " with "+memory+ " GG only at "+ price+ "$." );
	}
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		Mobile mobile1 = new Mobile("samsung ","s10",126,500.50);
		mobile1.newPhone("iphone", "11pro", 500, 1200);
	}
}
