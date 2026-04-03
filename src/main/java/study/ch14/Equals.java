package study.ch14;

import java.util.Objects;
import java.util.TreeMap;

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher teacher)) return false;//instanceof -> 객체 타입 확인
        return age == teacher.age && Objects.equals(name, teacher.name);

//        if (!(o instanceof study.ch14.Teacher)){//class명이 같고 패키지명이 다를때
//            return false;
//        }Teacher teacher1 = (Teacher) o;
//        return this.age == teacher1.age && this.name.equals(teacher1.name);

    }

}

public class Equals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("권민주", 22);//this == object
        Teacher teacher2= new Teacher("권민주", 22);

        System.out.println(teacher1.equals(teacher2));
    }
}
