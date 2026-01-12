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
    public static void main (Stringp[] args) {

    }
}