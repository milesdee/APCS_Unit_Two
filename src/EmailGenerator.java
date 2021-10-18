import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name (first + last)?");
        String fullName = scan.nextLine().toLowerCase();
        System.out.println("What is your email provider (gmail.com, etc)?");
        String provider = scan.nextLine().toLowerCase();
        System.out.println("Alright, " + EmailGenerator.makeEmail(makeUserName(fullName), provider) +
                " is your new email! Enjoy!");
    }
    public static String makeUserName(String fullName) {
        String userName = fullName.charAt(0) + fullName.substring((fullName.indexOf(" ") + 1)) +
                ((int)(Math.random()*99)+1);
        return userName;
    }
    public static String makeEmail(String userName, String provider) {
        String generatedEmail = userName + "@" + provider;
        return generatedEmail;
    }

}
