package Static;

public class Class1 {

    static final double Pi = 3.14;
    static int method1 (int a, int b, int c) {
        return a * b * c;
    }

    static void method2(int a, int b) {
        int celoe = (int)a / b;
        int ostatok = a % b;
        System.out.println("Целое: " + celoe);
        System.out.println("Остаток: " + ostatok);
    }

    double ploshad(double radius) {
        return Pi * radius * radius;
    }

    static double perimetr(double radius) {
        return Pi * 2 * radius;
    }

    void info(double radius) {
        System.out.println("Radius: " + radius);
        System.out.println("Ploshad: " + ploshad(radius));
        System.out.println("Perimetr: " + perimetr(radius));
    }

}

class Class2 {
    public static void main(String[] args) {

        Class1.method1(10,4, 6);
        Class1.method1(3,6, 8);
        Class1.method2(10,4);
        Class1.method2(11,3);

        Class1 c1 = new Class1();
        c1.ploshad(11.1);
        Class1.perimetr(12.2);
        c1.info(3.3);
    }

}