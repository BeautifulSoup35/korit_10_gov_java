package ex;

public class Ex03 {
    public static void main(String[] args) {
        GrandStudent student = new GrandStudent("김자바", "컴퓨터공학", "인공지능");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person 생성자: 김자바");
    }
}
class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
        System.out.println("Student 생성자: 컴퓨터공학");
    }
}
class GrandStudent extends Student {
    private String minor;

    public GrandStudent(String name, String major, String minor) {
        super(name, major);
        this.minor = minor;
        System.out.println("GradStudent 생성자: 인공지능");
    }

}
