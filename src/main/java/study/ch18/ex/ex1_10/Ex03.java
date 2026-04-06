package study.ch18.ex.ex1_10;


import java.sql.SQLOutput;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student("김");
        Student s2 = new Student("권");
        Student s3 = new Student("진");
        System.out.println(Student.getStudentCount());
    }


}

class Student {
    String name;
    int id;
    static int nextId = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }
    static public int getStudentCount(){
        return nextId - 1;
    }

}
