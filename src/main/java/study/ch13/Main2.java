package study.ch13;

abstract class AbstractAnimal {
    String name;

    public AbstractAnimal() {
    }

    public AbstractAnimal(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}

class Duck extends AbstractAnimal implements Flyable, Swimmable {
    //단일상속과 다중구현
    public Duck() {
        super();
    }
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.fly();
        duck.swim();

        duck.setName("우리집오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }
}
