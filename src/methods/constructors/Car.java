package methods.constructors;

public class Car {
	String brand;
	String model;
	double price;
	String color;
	double milege;
	public Car() {
		System.out.println("......no arg constructor..........");
	}
	
	public Car(String brand, String model, double price) {
		System.out.println(".......... Threee Parameterized  constructor.....");
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public Car(String color,double milege) {
		System.out.println("..........Two  Parameterized  constructor.....");
		this.color=color;
		this.milege=milege;
	}
	
	void display() {
		System.out.println("Car Brand :"+brand);
		System.out.println("Car Model :"+model);
		System.out.println("Car Price :"+price);
	}
	void display2() {
		System.out.println("car color :"+ color);
		System.out.println("car milege : "+milege);
	}

	public static void main(String[] args) {
		Car c1=new Car();
		c1.display();
		Car c2=new Car("Kia","sonet",800000);
		c2.display();
		Car c3=new Car("black",30);
		c3.display2();	
	}
	

}
