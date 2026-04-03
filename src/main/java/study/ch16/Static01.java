package study.ch16;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schoolName;


    /**
     *  @Override
     *     public String toString() {
     *         return "Student{" +
     *                 "name='" + name + '\'' +
     *                 '}';
     *     }
     *
     */

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public static String getSchoolName(){
        return schoolName;
    }

    public static Student crateStudent(String name) {
//        this.name = name; 인스턴스로 접근 불가능
        Student student = new Student();
        student.setName(name);//== this.name = name : 객체 만들어서 set으로 이름 넣기 class안에서 자신 객체 생성가능
        //static에서 인스턴스 반환하기
        return student;
    }


}

public class Static01 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("권민주");

        Student.setSchoolName( "해양대학교");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("진혜정");
        System.out.println(student);//to string은 인스턴스의 정보만

        Student.crateStudent("김명준");
        Student student1 = Student.crateStudent("김명준");


    }
}
