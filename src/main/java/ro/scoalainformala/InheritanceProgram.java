package ro.scoalainformala;

import ro.scoalainformala.shapes.*;

public class InheritanceProgram {

    public static void main(String[] args) {
        Shape s = new Rectangle(4, 6);
        s.getPerimeter();

        Shape sh = new Square(10);
        sh.getPerimeter();

        Circle r = new Circle(7);
        Shape[] shapes = {
                r,
                new Circle(10),
                new Triangle(2, 2, 3),
                new Rectangle(5, 3),
                new Square(20)
        };

        for (Shape x : shapes) {
            System.out.println("Aria formei geometrice este: " + x.getArea());
        }
    }
}
