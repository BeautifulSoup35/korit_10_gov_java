package study.ch12.ex.ex11_15;

public class Ex12 {
    public static void main(String[] args) {
//        makeNoise(new Dog(), 2);
//        makeNoise(new Cat(), 2);

    }
}

 abstract  class  Animal {
    void makeNoise(Animal a, int count){
        for(int i =0; i< count; i++) {
            a.speak();
        }
    }
    abstract String speak();
}

class Dog extends Animal{
    @Override
    String speak() {
        return "멍멍";
    }
}
class Cat extends Animal{
    @Override
    String speak() {
        return "야옹";
    }
}
