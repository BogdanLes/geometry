package ro.scoalainformala;
import java.util.Scanner;
import ro.scoalainformala.menu.Menu;
import ro.scoalainformala.classes.Circle;

public class GeometryMenu {
    public static void main(String[] args) {

        String item = "0";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(Menu.createMenu());
            item = s.next();

            if("1".equals(item)) {
                //triangle
                System.out.println("triangle");
            } else if("2".equals(item)) {
                //rectangle
                System.out.println("rectangle");
            } else if("3".equals(item)) {
                //square
                System.out.println("square");
            } else if("4".equals(item)) {
                //circle
                System.out.println("Enter circle radius(cm):");
                float r = s.nextFloat();
                Circle c = new Circle();
                c.setRadius(r);
                System.out.println("The area of the circle is: " + c.getAreaCircle() + " cm2");
                System.out.println("The diameter of the circle is: " + c.getDiameterCircle() + " cm");
                System.out.println("The circumference of the circle is: " + c.getCircumferenceCircle() + " cm");
            } else if("5".equals(item)) {
                //exit
                System.out.println("Goodbye!");
            } else {
                //wrong option
                System.out.println("Wrong option. Please select again.");
            }

        }while(!"5".equals(item));

    }
}