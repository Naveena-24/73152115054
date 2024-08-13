class Person {
    // Attributes of the Person class
    String name;
    int age;

    // Constructor to initialize the attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the Person's details  
    void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to test the Person class
public class Main {
    public static void main(String[] args) {
        // Create two instances of the Person class
        Person person1 = new Person("Naveena", 25);
        Person person2 = new Person("Pradeepika", 30);

        // Display the details of each Person
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}