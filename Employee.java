package Acess_modifieres;

public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void details() {
        System.out.println("ID =" + id);
        System.out.println("Name =" + name);
        System.out.println("Salary =" + salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);
        e1.details();
        System.out.println();
        e2.details();
    }
}