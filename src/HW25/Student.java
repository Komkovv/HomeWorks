package HW25;
public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
    Student(StringBuilder sb, int course, int grade) {
        StringBuilder sbtemp = new StringBuilder(sb);
        if (sbtemp.length() > 3) {
            name = sbtemp;
        }
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }

    }
    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printCourse() {
        System.out.println("Course: " + course);
    }

    public void printGrade() {
        System.out.println("Grade: " + grade);
    }
    public void showInfo() {
        printName();
        printCourse();
        printGrade();
    }
}
//test comment
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(new StringBuilder("Vasiliy"), 3, 6);
        s1.showInfo();
    }

}
