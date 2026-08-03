package methods.constructors;

public class CarMultipleChaining {

	String brand;
	String model;
	double price;
	String color;
	double milege;
	public CarMultipleChaining(String brand, String model, double price,String color,double milege) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color=color;
		this.milege=milege;
	}
	
	public CarMultipleChaining(String brand, String model, double price,String color) {
		this(brand,model,price,color, 30);
		
		
	}
	public CarMultipleChaining(String brand,String model) {
		this(brand,model,5000,"red",50);
		
	}
	
	void display() {
		System.out.println("---------------------------------");
		System.out.println("Car Brand :"+brand);
		System.out.println("Car Model :"+model);
		System.out.println("Car Price :"+price);
		System.out.println("car color :"+ color);
		System.out.println("car milege : "+milege);
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		CarMultipleChaining c2=new CarMultipleChaining("kia","sonet");
		c2.display();
		CarMultipleChaining c1=new CarMultipleChaining("bmw", "Suji", 2000,"pink");
		c1.display();
		CarMultipleChaining c3=new CarMultipleChaining("hundai ","kreta");
		c3.display();	
		
	}
}
