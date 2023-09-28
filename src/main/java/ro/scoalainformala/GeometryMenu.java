package ro.scoalainformala;

import java.util.Scanner;

import ro.scoalainformala.menu.Menu;
import ro.scoalainformala.shapes.Circle;
import ro.scoalainformala.shapes.Square;
import ro.scoalainformala.shapes.Rectangle;
import ro.scoalainformala.shapes.Triangle;
import ro.scoalainformala.user.Validate;

public class GeometryMenu {
    public static void main(String[] args) {

        String item = "0";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(Menu.createMenu());
            item = s.nextLine();

            boolean vi = false;
            String ui = "";
            if ("1".equals(item)) {
                //triangle
                float ul1 = 0.0F;
                do {
                    System.out.print("Enter first side of the triangle(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        ul1 = Float.parseFloat(ui);
                    }
                } while (vi == false || ul1 < 0.1F);
                float ul2 = 0.0F;
                do {
                    System.out.print("Enter second side of the triangle(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        ul2 = Float.parseFloat(ui);
                    }
                } while (vi == false || ul2 < 0.1F);
                float ul3 = 0.0F;
                float vertr = ul1 + ul2 - 0.1F;
                do {
                    System.out.print("Enter third side of the triangle(cm between: 0.1 - " + vertr + "): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        ul3 = Float.parseFloat(ui);
                    }
                } while (vi == false || (ul3 < 0.1F || ul3 > vertr));

                Triangle tr = new Triangle(ul1, ul2, ul3);
                System.out.println("The area of the triangle is: " + tr.getArea() + " cm2");
                System.out.println("The perimeter of the triangle is: " + tr.getPerimeter() + " cm");
            } else if ("2".equals(item)) {
                //rectangle
                float lr = 0.0F;
                do {
                    System.out.print("Enter the length of the rectangle(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        lr = Float.parseFloat(ui);
                    }
                } while (vi == false || lr < 0.1F);
                float wr = 0.0F;
                do {
                    System.out.print("Enter the width of the rectangle(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        wr = Float.parseFloat(ui);
                    }
                } while (vi == false || wr < 0.1F);

                Rectangle re = new Rectangle(lr, wr);
                System.out.println("The area of the rectangle is: " + re.getArea() + " cm2");
                System.out.println("The perimeter of the rectangle is: " + re.getPerimeter() + " cm");
                System.out.println("The diagonal of the rectangle is: " + re.getDiagonalRectangle() + " cm");
            } else if ("3".equals(item)) {
                //square
                float ss = 0.0F;
                do {
                    System.out.print("Enter the side of the square(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        ss = Float.parseFloat(ui);
                    }
                } while (vi == false || ss < 0.1F);

                Rectangle sq = new Square(ss);
                System.out.println("The area of the square is: " + sq.getArea() + " cm2");
                System.out.println("The perimeter of the square is: " + sq.getPerimeter() + " cm");
                System.out.println("The diagonal of the square is: " + sq.getDiagonalRectangle() + " cm");
            } else if ("4".equals(item)) {
                //circle
                float r = 0.0F;
                do {
                    System.out.print("Enter circle radius(cm): ");
                    ui = s.nextLine();
                    vi = Validate.input(ui, "float");
                    if (vi == true) {
                        r = Float.parseFloat(ui);
                    }
                } while (vi == false || r < 0.1F);

                Circle c = new Circle();
                System.out.println("The area of the circle is: " + c.getArea() + " cm2");
                System.out.println("The diameter of the circle is: " + c.getDiameterCircle() + " cm");
                System.out.println("The circumference of the circle is: " + c.getPerimeter() + " cm");
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
