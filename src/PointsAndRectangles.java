import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        System.out.print("Enter the top-left 'x' coordinate:");
        int userx = scan.nextInt();
        System.out.print("Enter the top-left 'y' coordinate:");
        int usery = scan.nextInt();
        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point p = new Point(userx, usery);
        // create print statements and get input for the length and width
        System.out.print("Enter your rectangle's length:");
        int userlen = scan.nextInt();
        System.out.print("Enter your rectangle's width:");
        int userwid = scan.nextInt();
        //Instantiate a Dimension object d.
        Dimension d = new Dimension(userlen, userwid);
        //Instantiate a Rectangle object r.
        Rectangle r = new Rectangle(p, d);
        // Print each object p, d, and r on a separate line.
        System.out.println(p);
        System.out.println(d);
        System.out.print(r);
    }
}