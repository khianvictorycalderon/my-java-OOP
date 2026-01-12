class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

}

public class PolymorphismOverloading {
    public static void main(String[] args) {

        Calculator calculate = new Calculator();

        // Adding 2 numbers
        System.out.println(calculate.add(5,3));
        System.out.println(calculate.multiply(4,5));

    }
}