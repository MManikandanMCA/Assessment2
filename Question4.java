package assessment2;

class Person {
    String name;
    int age;

    // Constructor with arguments
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Display method
    void display() { 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int salary;
    int employeeId;

    // Constructor using super to initialize Person attributes
    Employee(String name, int age, int salary, int id) {
        super(name, age);
        this.salary = salary;
        this.employeeId = id;
    }

    void displayDetails() {
        super.display(); // Call display from Person
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + employeeId);
    }
}


public class Question4 {
    public static void main(String[] args) {
        Employee obj = new Employee("Manikandan", 25, 80000, 1);  //create a object
        obj.displayDetails();  //call a method
    } 
}
