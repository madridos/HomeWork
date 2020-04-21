package ptoject55;

public class Pizza {

	String name;
	 String origine;
	int year;
	float priceIncrease ;
	boolean healthy;

public	Pizza(){
		
		System.out.println(" hey pizza lovers ");
	
	}

	public Pizza(String name){
		
		this.name=name;
		
		System.out.println(this.name);
		
		
	}
	
	public  void seeHistory(String Origine,int Year) {
		
		origine= Origine;
		year= Year;
		
		System.out.println("was originated from "+origine+ "in " + Year);
	}
	
	public boolean eatHealthy(boolean healthy) {
		
		System.out.println("is much quantity of pizza healthy?: " +false );
		     int number=8;
		if(number <=1) {
			System.out.println("1 pizza a day is good enough");
		}else{
			System.out.println("more than one pizza a day is not good for health");
		}
		return healthy;
		}
		
		
//	public  void setPrices(float priceIncrease) {
//		float price=priceIncrease;
//		float a=5.5f;
//		
//		for(a=0;a<3;a++) {
//			
//			System.out.println(priceIncrease);	
//		}
//	}
		public static void main(String[] args) {
			Pizza obj1 = new Pizza();
			obj1.eatHealthy(false);
			obj1.seeHistory("italy ", 1889);
//			obj1.setPrices(5.5f);
		}

	}
	
	
