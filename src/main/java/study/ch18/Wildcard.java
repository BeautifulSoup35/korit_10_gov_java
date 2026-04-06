package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

public class Wildcard {
    public static void print(SuccessResponse<? extends Object> sr) {
        System.out.println(sr);
    }
        //상한 제한 와일드카드
    public static void print2(SuccessResponse<? extends Student> sr) {//Student 아래쪽
        System.out.println(sr);
    }
    //하한 제한 와일드카드
    public static void print3(SuccessResponse<? super Student> sr) {//Student 위쪽
        System.out.println(sr);
    }

    public static void main(String[] args) {
        SuccessResponse<User> sr1= new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2= new SuccessResponse<>(200, "그냥문자열");

        System.out.println(sr1);
        System.out.println(sr2);
    }
}
