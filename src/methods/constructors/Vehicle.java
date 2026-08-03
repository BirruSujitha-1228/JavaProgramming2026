package methods.constructors;

public class Vehicle {
	String brand;
	double price;
	Vehicle(){
		this("toyota",10000);
		
		
	}
	Vehicle(String brand,double price){
		this.brand=brand;
		this.price=price;
	}

}
class Carr extends Vehicle{
	String color;
	String fuelType;
	Carr(){
		super();
		color="black";
		fuelType="petrol";
	}
	
	Carr(String brand,double price,String color,String fuelType){
		super(brand,price);
		this.color=color;
		this.fuelType=fuelType;
	}
	public void display() {
		System.out.println("vehicle brand :"+brand);
		System.out.println("vehicle price : "+price);
		System.out.println("vehicle color : "+color);
		System.out.println("vehicle fuelType : "+fuelType);
		System.out.println("----------------------------------------");
	}
	public static void main(String[] args) {
		Carr c1=new Carr();
		c1.display();
		Carr c2=new Carr("BMW",20000,"red","diesel");
		c2.display();
		

	}
}

