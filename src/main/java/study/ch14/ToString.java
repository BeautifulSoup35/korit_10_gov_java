package study.ch14;

import java.util.Arrays;

class Student extends Object{
    private String name;
    private int score;

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름: " + name + "점수: " + score;
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("권민주", 100);
        System.out.println(student.toString());//.toString() 객체를 print하면 tostring이 자동으로 호출
        System.out.println(student);
        String a = student + "";
        System.out.println(a);
//       [ -> 배열 , I -> int

        int[] nums = {1, 2,3 ,4};
        System.out.println(Arrays.toString(nums));
    }

}
