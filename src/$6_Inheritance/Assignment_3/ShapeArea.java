package $6_Inheritance.Assignment_3;
// Assignment Question: assets/files/pdf_4_Assignment.pdf
public class ShapeArea {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(4.4,7.1);
        shapes[1] = new Triangle(8.8,5.36);
        shapes[2] = new Rectangle(9.98,3.14);
        shapes[3] = new Rectangle(11.87,6.61);
        shapes[4] = new Circle(8.2);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].getArea();
        }
    }
}

abstract class Shape{
    double length;
    abstract double getArea();
}

class Triangle extends Shape{
    double height;
    Triangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    double getArea() {
        double area = 0.5*length*height;
        System.out.println("The area of the triangle is " + area);
        return area;
    }
}
class Rectangle extends Shape{
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        double area = length*width;
        System.out.println("The area of the rectangle is " + area);
        return area;
    }
}
class Circle extends Shape{
    Circle(double length){
        this.length = length;
    }
    @Override
    double getArea() {
        double area = 3.1416*Math.pow(length,2);
        System.out.println("The area of the circle is " + area);
        return area;
    }
}
