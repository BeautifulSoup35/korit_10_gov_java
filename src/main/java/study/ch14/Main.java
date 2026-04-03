package study.ch14;

class Animal {

}

class Duck extends Animal {

}


public class Main {
    public static void main(String[] args) {
        //최상위 객체 (Odject)
        Object a = 10;//리터럴값이 대입될수있는 이유 -> Boxing
        Object b = 3.14;
        Object c = "이세상은";
        Object d = 'd';
        Object e = new Animal();

        //wrapper class
        Integer  integer = 10;//일반 자료형 -> 클래스 자료형으로 바꾼것(Boxing)
        int i = integer;// 클래스자료형을 -> 일반자료형으로 (unBoxing)
        //자바는 Boxing, UnBoxing이 자동 -> AutoBoxing

        Integer  integer2 = null;//클래스 자료형인 이유 확인

        System.out.println((int)a + (double) b);//

    }
}
