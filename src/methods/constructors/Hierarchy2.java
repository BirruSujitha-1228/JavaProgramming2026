package methods.constructors;

class AnimalCopy {
	String name;
	int age;

	public AnimalCopy() {
		this("cat", 3);
		System.out.println("Animal Default Constructor");
	}

	public AnimalCopy(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
		System.out.println("Animal Parameterized Constructor");
		
	}

}

class MammalCopy extends AnimalCopy {
	String type;

	public MammalCopy() {
		super();
		System.out.println("Mammal default Constructor");
	}

	public MammalCopy(String name, int age,String type) {
		super(name,age);
		this.type = type;
		System.out.println("mammal Parameterized Constructor");
	}

}

class DogCopy extends MammalCopy {
	String breed;

	public DogCopy() {
		//super();
	    //System.out.println("Dog Default Constructor");
	    this("rabbit",1,"wild","unkonown");
	}

	public DogCopy(String name, int age,String type,String breed) {
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

public class Hierarchy2 {

	public static void main(String[] args) {
		DogCopy d = new DogCopy();
		d.display();
		DogCopy d2 = new DogCopy("lion ",4,"wild","labrador");
		d2.display();
	}
}
