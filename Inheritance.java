class Person {

    String age;
    int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {

    String subject;

    Teacher (String name, int age, String subject) {
        super(name, age); // Call parent constructor
        this.subject = subject;
    }

}

class Janitor extends Person {

    String cleaning_location;

    Janitor (String name, int age, String cleaning_location) {
        super(name, age); // Call parent constructor
        this.cleaning_location = cleaning_location;
    }

}

public class Inheritance {
    public static void main (String[] args) {

        // A regular person
        Person person = new Person("John", 15);
        System.out.println("Hello I am " + person.name + " and I am " + person.age + " years old.");

        // A teacher
        Teacher teacher = new Teacher("Jake", 28, "Science");
        System.out.println("Hi, I'm teacher " + teacher.name + ", and I am " + teacher.age + " years old, I teach " + teacher.subject + " subject.");

    }
}