package ro.scoalainformala;

import java.util.Scanner;

import ro.scoalainformala.menu.Menu;
import ro.scoalainformala.classes.Circle;
import ro.scoalainformala.classes.Square;
import ro.scoalainformala.classes.Rectangle;

public class GeometryMenu {
    public static void main(String[] args) {

        String item = "0";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(Menu.createMenu());
            item = s.next();

            if ("1".equals(item)) {
                //triangle
                System.out.println("triangle");
            } else if ("2".equals(item)) {
                //rectangle
                System.out.print("Enter the length of the rectangle(cm): ");
                float lr = s.nextFloat();
                System.out.print("Enter the width of the rectangle(cm): ");
                float wr = s.nextFloat();
                Rectangle re = new Rectangle();
                re.setValues(lr, wr);
                System.out.println("The area of the rectangle is: " + re.getAreaRectangle() + " cm2");
                System.out.println("The perimeter of the rectangle is: " + re.getPerimeterRectangle() + " cm");
                System.out.println("The diagonal of the rectangle is: " + re.getDiagonalRectangle() + " cm");
            } else if ("3".equals(item)) {
                //square
                System.out.print("Enter the side of the square(cm): ");
                float ss = s.nextFloat();
                Square sq = new Square();
                sq.setSide(ss);
                System.out.println("The area of the square is: " + sq.getAreaSquare() + " cm2");
                System.out.println("The perimeter of the square is: " + sq.getPerimeterSquare() + " cm");
                System.out.println("The diagonal of the square is: " + sq.getDiagonalSquare() + " cm");
            } else if ("4".equals(item)) {
                //circle
                System.out.print("Enter circle radius(cm): ");
                float r = s.nextFloat();
                Circle c = new Circle();
                c.setRadius(r);
                System.out.println("The area of the circle is: " + c.getAreaCircle() + " cm2");
                System.out.println("The diameter of the circle is: " + c.getDiameterCircle() + " cm");
                System.out.println("The circumference of the circle is: " + c.getCircumferenceCircle() + " cm");
            } else if ("5".equals(item)) {
                //exit
                System.out.println("Goodbye!");
            } else {
                //wrong option
                System.out.println("Wrong option. Please select again.");
            }

        } while (!"5".equals(item));

    }
}