public class Employee1 {
    String name;
    public String surname;
    private double salary;

    Employee1 (String nameIn, String surnameIn, double salaryIn) {
        name = nameIn;
        surname = surnameIn;
        salary = salaryIn;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}


class Employee1Test {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Ivan", "Petrovich", 1000.11);
        Employee1 e2 = new Employee1("Maksim", "Ivanovich", 2000.12);
        Employee1 e3 = new Employee1("Dmitriy", "Dmitrievich", 3000.13);
        e1.info();
        e2.info();
        e3.info();
    }
}