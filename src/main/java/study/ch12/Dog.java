package study.ch12;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("강아지가 밥을 먹는다");
    }
    //추상메소드를 그대로 물려받는다 -> 추상 클래스이거나 추상 메소드를 구현한다

}
