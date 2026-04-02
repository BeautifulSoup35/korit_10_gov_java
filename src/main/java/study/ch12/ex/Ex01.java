package ex;

public class Ex01 {
    public static void main(String[] args) {
        Dog d = new Dog("바둑이", "진돗개");
        d.eat();   // 바둑이이(가) 밥을 먹는다
        d.bark();  // 멍멍!

        Cat c = new Cat("나비", true);
        c.eat();   // 나비이(가) 밥을 먹는다
        c.meow();  // 야옹!
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name +"(이)가 밥을 먹는다.");
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void bark(){
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    boolean isIndoor;

    public Cat(String name,boolean isIndoor ) {
        super(name);
        this.isIndoor = isIndoor;
    }
    void meow() {
        System.out.println("야옹!");
    }

}
