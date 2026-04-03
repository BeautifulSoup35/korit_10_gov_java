package study.ch12.ex.ex1_5;

public class Ex02 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(10, 2,"아반때");
        electricCar.charge();
        electricCar.drive();
        electricCar.start();
    }
}

class Vehice {
    private String brand;

    public Vehice(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " 시동켜기");
    }

    public String getBrand() {
        return brand;
    }
}

class Car extends Vehice {
    private int door;

    public Car(int door, String brand) {
        super(brand);
        this.door = door;
    }

    void drive(){
        System.out.println(super.getBrand() + " 주행 중");
    }
}

class ElectricCar extends Car {
    private int battery;

    public ElectricCar(int battery, int door, String brand) {
        super(door , brand);
        this.battery = battery;
    }

    void charge(){
        System.out.println(super.getBrand() + "충전중" + battery +"% 출력");
    }
}

//실수 : super를 사용할려면 부모 생성자가 존재해야만한다.