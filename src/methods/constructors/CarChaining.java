package methods.constructors;

public class CarChaining {

	String brand;
	String model;
	double price;
	String color;
	double milege;
	public CarChaining() {
		this("bmw", "Suji", 2000);
		System.out.println("......no arg constructor..........");
	}
	
	public CarChaining(String brand, String model, double price) {
		this("black", 30);
		System.out.println(".......... Threee Parameterized  constructor.....");
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public CarChaining(String color,double milege) {
		System.out.println("..........Two  Parameterized  constructor.....");
		this.color=color;
		this.milege=milege;
	}
	
	void display() {
		System.out.println("Car Brand :"+brand);
		System.out.println("Car Model :"+model);
		System.out.println("Car Price :"+price);
		System.out.println("car color :"+ color);
		System.out.println("car milege : "+milege);
	}

	public static void main(String[] args) {
		CarChaining c1=new CarChaining();
		c1.display();
		//CarChaining c2=new CarChaining();
		//c2.display();
		//CarChaining c3=new CarChaining("black",30);
		//c3.display();	
	}
}
