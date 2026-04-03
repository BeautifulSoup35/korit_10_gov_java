package study.ch12.ex.ex6_10;

public class Ex06 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);

        for(Shape a : shapes){
            System.out.println(a.getArea());
        }
    }
}
class Shape {
    double getArea(){
        return 0.0;
    }

}
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius *3.14;
    }
}
class Rectangle extends  Shape{
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}
