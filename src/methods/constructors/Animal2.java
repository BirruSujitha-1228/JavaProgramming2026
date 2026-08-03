package methods.constructors;

public class Animal2 {
	String name;
	int age;
	String color;

	Animal2() {
		this("bruno", 2,"white");

	}

	Animal2(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color=color;
		System.out.println("Animal class construtor");
	}

}

class Dog2 extends Animal2 {
	String breed;

	Dog2() {
		//super();   Java compiler automatically inserts super(); as the first statement.
		breed="unknown";
	}

	Dog2(String name, int age,String breed,String color) {
		super(name, age,color);
		this.breed = breed;
		this.color=color;
		//color="black";
	}

	public static void main(String[] args) {
		Dog2 d1 = new Dog2();
		d1.display();
		Dog2 d2 = new Dog2("Rocky",3,"labrador","black");
		d2.display();
	}

	
	
	public void display() {
		System.out.println("Animal Name : " + name);
		System.out.println("Animla age : " + age);
		System.out.println("Animal breed : " + breed);
		System.out.println("Animal color : "+color);
		System.out.println("-------------------------------------");
	}

}
