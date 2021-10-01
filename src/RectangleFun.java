import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);
        // Get input for x, y, width, and height. Create four separate variables for these.
        System.out.println("Where do you want your rectangle?");
        System.out.print("X:");
        double x = scan.nextDouble();
        System.out.print("Y:");
        double y = scan.nextDouble();
        System.out.println("How wide do you want your rectangle?");
        double wid = scan.nextDouble();
        System.out.println("How tall do you want your rectangle?");
        double hgt = scan.nextDouble();
        // Create a Rectangle object using the four pieces of user input.
        Rectangle rec = new Rectangle((int)x, (int)y, (int)wid, (int)hgt);
        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        double perimeter = (rec.getWidth() + rec.getHeight()) * 2;
        System.out.println();
        System.out.println("X: " + rec.getX());
        System.out.println("Y: " + rec.getY());
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Also, we moved your rectangle.");
        rec.y += 4;
        rec.x -= 2;
        System.out.println();
        System.out.println("It's over at (" + rec.getX() + "," + rec.getY() + ").");
        System.out.println("Hope you don't mind.");
        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        rec.getX();
        rec.getY();
    }
}
