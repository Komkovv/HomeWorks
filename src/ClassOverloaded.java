public class ClassOverloaded {

    void method() {
        System.out.println(0);;
    }

    void method(int a1) {
        method(a1,0,0,0);
    }

    void method(int a1, int a2) {
        method(a1,a2,0,0);
    }

    void method(int a1, int a2, int a3) {
        method(a1,a2,a3,0);
    }

    void method(int a1, int a2, int a3, int a4) {
        System.out.println(a1+a2+a3+a4);
    }

}

class OverloadedTest {
    public static void main(String[] args) {
        ClassOverloaded cO = new ClassOverloaded();
        cO.method(10,2,3);
    }
}
