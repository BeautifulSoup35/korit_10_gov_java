package study.ch12.ex.ex6_10;



public class Ex07 {
    public static void main(String[] args) {
        Student1 s = new Student1("김자바", 20, 3.8);
        System.out.println(s);
    }
}

class Student1 {
    String name;
    int age;
    double gpa;

    public Student1(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}

