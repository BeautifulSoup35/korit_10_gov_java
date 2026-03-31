package study.ch08;

public class OBJ03 {
    public static void main(String[] args) {

        class Student {
            String name;
            int age;

            Student(String name, int age){//생성자
                System.out.println("학생 생성");
                this.name = name;
                this.age = age;
            }

        }
        Student s1 = new Student("권민중", 22);
        s1.name = "권민주";
        Student s2 = new Student("권하중", 23);
//        Student s3 = new Student();


    }
}
