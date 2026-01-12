class Greet {
    void greet() {
        System.out.println("Hello there!");
    }
}

class Hello extends Greet {
    @Override
    void greet() {
        System.out.println("Hi there, Overrided!");
    }
}

public class PolymorphismOverriding {
    public static void main(String[] args) {

        Greet greeting1 = new Greet();
        Hello hello1 = new Hello();

        greeting1.greet();
        hello1.greet();

    }
}