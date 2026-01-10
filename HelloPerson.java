class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    void displayInfo() {
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }
}

public class HelloPerson {
    public static void main(String[] args) {
        
        // Creating an object
        Person person1 = new Person("Bob", 14);

        // Displaying the output
        person1.displayInfo();

        // Another object
        Person person2 = new Person("Jake", 17);
        person2.displayInfo();

    }
}