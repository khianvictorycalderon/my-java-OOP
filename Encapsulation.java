class Person {

    // Encapsulation (Private variables)
    private String name;
    private int age;

    // Validation functions
    public static void validateName(String inputName) {
        if (inputName == null || inputName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
    }

    public static void validateAge(int inputAge) {
        if (inputAge < 18) {
            throw new IllegalArgumentException("Age must not be a minor!");
        }
    }

    // Constructor with validation
    public Person(String name, int age) {
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    // Name getter function
    public String getName() {
        return this.name;
    }

    // Name setter function
    public void setName(String newName) {
        validateName(newName);
        this.name = newName;
    }

    // Age getter function
    public int getAge() {
        return this.age;
    }

    // Age setter function
    public void setAge(int newAge) {
        validateAge(newAge);
        this.age = newAge;
    }
}

public class Encapsulation {
    public static void main (String[] args) {

        // Person 1:
        Person person1 = new Person("Bob", 19);
        System.out.println("Hello I am " + person1.getName() + ", and I am " + person1.getAge() + " years old.");

        
        // Person 2:
        // This will throw an error because age is minor
        Person person2 = new Person("Jake", 15);
        System.out.println("Hello I am " + person2.getName() + ", and I am " + person2.getAge() + " years old.");

        // Person 3:
        // This will also throw an error because name is empty
        Person person3 = new Person("", 21);
        System.out.println("Hello I am " + person3.getName() + ", and I am " + person3.getAge() + " years old.");

    }
}