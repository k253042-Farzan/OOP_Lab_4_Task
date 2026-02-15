class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    Employee(Employee e) {
        name = e.name;
        salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Hasan", 65000);

        Employee emp2 = new Employee(emp1);

        emp2.name = "Farzan";
        emp2.salary = 80000;

        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("Duplicate Employee:");
        emp2.display();
    }

}
