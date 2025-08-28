public class Student {
    int id;
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    int count;

    Student(int i, int d1, int d2, int d3, int d4, int d5) {
        id = i;
        grade1 = d1;
        grade2 = d2;
        grade3 = d3;
        grade4 = d4;
        grade5 = d5;
        count = 5;
    }

    Student (int i, int id1){
        this(i, id1, 0 ,0, 0, 0);
        count = 1;
    }

    Student (int i, int id1, int id2){
        this(i, id1, id2 ,0, 0, 0);
        count = 2;
    }

    Student (int i, int id1, int id2, int id3){
        this(i, id1, id2 ,id3, 0, 0);
        count = 3;
    }

    Student (int i, int id1, int id2, int id3, int id4){
        this(i, id1, id2 ,id3, id4, 0);
        count = 4;
    }

    void averageGrade() {
        double avDeg = Math.round((double) ((grade1 + grade2 + grade3 + grade4 + grade5)) / count * 100);
        System.out.println("Student" + id + "average grade: " + avDeg / 100);
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(1,4);
        Student student2 = new Student(2, 1,1);
        Student student3 = new Student(3, 4,5,1);
        Student student4 = new Student(3, 4,5,1, 5);
        Student student5 = new Student(3, 4,5,1, 1, 1);

        student1.averageGrade();
        student2.averageGrade();
        student3.averageGrade();
        student4.averageGrade();
        student5.averageGrade();
    }


}