import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.println("What's your first name?");
        String firstName = (scan.nextLine()).trim();
        System.out.println("What's your last name?");
        String lastName = (scan.nextLine()).trim();
        // Use the required string methods to print out the information
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() + lastName.length());
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));
        System.out.println();
    }
}
