package study.ch12.ex.ex16_20;

public class Ex20 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("원1");
        shapes[1] = new Rectangle("네모2");

        

    }
}

abstract class Shape {
    String name;
    abstract double getArea();
    abstract double getPerimeter();

    public Shape(String name) {
        this.name = name;
    }
}

interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

class Circle extends Shape implements Drawable, Resizable {
    double radius;

    public Circle(String name) {
        super(name);
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {//기본이 디폴트로 생성이됌
        System.out.println(name + "원그리기");
    }
    public void resize(double factor) {
        System.out.println(radius * factor);
    }
}

class Rectangle extends Shape implements Drawable, Resizable {
    double width, height;

    public Rectangle(String name) {
        super(name);
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    public void draw() {//기본이 디폴트로 생성이됌
        System.out.println(name + "사각형 그리기");
    }
    public void resize(double factor) {
        System.out.println(width * height * factor);
    }

}