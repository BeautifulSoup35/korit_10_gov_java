package study.ch11;

abstract class AA {

}

class BB extends AA{

}

class MM {
    public static void main(String[] args) {
        BB b = new BB();
    }
}

class Animal {
    private String name;

    //AllArgumentsConstructor
    public Animal(String name) {

        this.name = name;
//        showInfo();
    }
    //기본생성자(noArgumentsConstructor;
    public Animal() {}



    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name +"(이)가 밥을 먹는다");
    }

    public void showInfo() {
        System.out.println("이름: " + name);
    }

}

class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(super.getName() + "(이)가 멍멍한다.");
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("종: " + breed);
    }


}

class Cat extends Animal{
    private String color;

    public Cat(String name, String color) {
//        this. -> super. ->super()
        super(name);
        this.color = color;
    }

    public void grooming() {
        System.out.println(super.getName() + "(이)가 그루밍을 한다.");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("색상: " + color);
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", "검은색");

         dog.eat();
         cat.eat();

         dog.bark();
         cat.grooming();

         dog.showInfo();
         cat.showInfo();

         Animal[] animals = new Animal[6];

         animals[0] = new Animal("그냥 동물");
         animals[1] = new Cat("야옹이", "화이트");
         animals[2] = new Dog("콩이", "말티즈");
         animals[3] = new Dog("두부", "말티즈");
         animals[4] = new Cat("네오", "블랙");
         animals[5] = new Animal("무슨 동물");

         double d = 10;//업캐스팅
        for(Animal b : animals) {
            b.showInfo();
            if(b instanceof Dog) {
                ((Dog) b).bark();
            }else if(b instanceof Cat){
                ((Cat) b).grooming();
            }else{
                System.out.println("추가 기능없음");
            }
        }













    }
}
