package methods.constructors;

public class Student {
    int id;
    String name;

    // No-argument constructor
    // If we create an object without passing any values,
    // this constructor is called.
    // It calls the one-parameter constructor with default id = 1.
    public Student() {
        this(1);
    }

    // One-parameter constructor
    // It calls the two-parameter constructor.
    // Here the default name is "Suji".
    public Student(int id) {
        this(id, "Suji");
    }

    // Master constructor
    // This constructor initializes the object.
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        // No values are passed.
        // So default values (1, Suji) are assigned.
        Student s = new Student();
        s.display();

        // User-defined values are passed.
        Student s2 = new Student(2, "mammu");
        s2.display();

        Student s3 = new Student(3, "Hithu");
        s3.display();

        // No-arg constructor assigns default values (1, Suji).
        Student s4 = new Student();

        // If we don't want the constructor values,
        // we can change them after the object is created.
        s4.id = 4;
        s4.name = "Subbu";

        s4.display();
    }

    public void display() {
        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("--------------------------");
    }
}