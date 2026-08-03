package methods.constructors;

class Animal {
	String name;
	int age;

	public Animal() {
		this("cat", 3);
		System.out.println("Animal Default Constructor");
	}

	public Animal(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
		System.out.println("Animal Parameterized Constructor");
		
	}

}

class Mammal extends Animal {
	String type;

	public Mammal() {
		this("tiger",2,"wild");
		System.out.println("Mammal default Constructor");
	}

	public Mammal(String name, int age,String type) {
		super(name,age);
		this.type = type;
		System.out.println("mammal Parameterized Constructor");
	}

}

class Dog extends Mammal {
	String breed;

	public Dog() {
		this("Dog",2,"Pet","Unknown");
	    System.out.println("Dog Default Constructor");
	}

	public Dog(String name, int age,String type,String breed) {
		super(name,age,type);
		this.breed = breed;
		System.out.println("Dog parametrized constructor");
	}

	public void display() {
		System.out.println("Animal name : " + name);
		System.out.println("Animal age : " + age);
		System.out.println("Animal type : " + type);
		System.out.println("Animal breed : " + breed);
		System.out.println("---------------------------------");
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		Dog d2 = new Dog("lion ",4,"wild","labrador");
		d2.display();

	}
}
