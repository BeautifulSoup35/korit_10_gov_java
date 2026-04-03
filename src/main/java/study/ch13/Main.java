package study.ch13;

abstract class Person {
    private String lastName;
    private String firstName;

    public abstract void showName();
    public void showName2() {}
}

interface Person2 {
    public String lastName = "";
    public String firstName = "";

    //private이 -> abstract는 몸체가 필요 근데 private하면 자식에서 몸체 구현 불가능
    // 안되고 초기화를 해야한다
    public abstract void showName();
    public default void showName2() {  }//-> public
}

class Student extends Person {
    @Override
    public void showName() {

    }
}
class Student2 implements Person2 {
    @Override
    public void showName() {

    }

//    @Override
//    public void showName2() {
//        Person2.super.showName2();
//    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student();//추상class 상속
        Person2 p2 = new Student2();//인터페이스
    }

}
