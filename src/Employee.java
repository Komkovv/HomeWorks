public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;

    Employee(int idIn, String nameIn, int ageIn, double salaryIn, String departmentIn) {
        id = idIn;
        name = nameIn;
        age = ageIn;
        salary = salaryIn;
        department = departmentIn;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Mike", 34, 1000, "Marketing");
        Employee e2 = new Employee(2, "Elena", 23, 14000.5, "Secretary");
        e1.doubleSalary();
        e2.doubleSalary();
        System.out.println(e1.salary);
        System.out.println(e2.salary);
    }
}
