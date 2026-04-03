package study.ch14;

import java.util.Objects;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 10);
        Dog dog2 = new Dog("콩이", 10);
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());

        Dog[] dogs  = {
                new Dog("이이", 20),
                new Dog("아이", 10),
                new Dog("유이", 10),
                new Dog("콩이", 10)
        };
        int hash = Objects.hash("콩이", 10);
        Dog foundDog = null;
        for(Dog d: dogs){
            System.out.println(d);
            if(d.hashCode() == hash){

                foundDog = d;
                break;
            }
        }
        System.out.println(foundDog);
    }
}
