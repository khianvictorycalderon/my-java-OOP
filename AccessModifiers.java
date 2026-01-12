class Person {

    public String name;       // Accessible anywhere
    protected int age;        // Accessible in same package
    String country;           // Default (package-private)
    private String secret;    // Accessible only in this class

    Person(String name, int age, String country, String secret) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.secret = secret;
    }

    // Public method to access private variable
    public void showSecret() {
        System.out.println("Secret: " + secret);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        Person p = new Person("John", 20, "Philippines", "Loves coding");

        System.out.println(p.name);      // ✅ public
        System.out.println(p.age);       // ✅ protected (same package)
        System.out.println(p.country);   // ✅ default (same package)

        // System.out.println(p.secret); // ❌ ERROR: private

        p.showSecret(); // ✅ access private via method
    }
}