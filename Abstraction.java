abstract class Animal {
    abstract void sound(); // Method must be implemented by subclass

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Arrf Arrf!");
    }
}

public class Abstraction {
    public static void main(String[] args) {

    }
}