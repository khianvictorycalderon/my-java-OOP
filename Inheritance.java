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