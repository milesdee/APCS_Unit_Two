import java.util.Scanner;


public class FightSong {
    /*
    This method is static, which means you don't need to make a new instance of FightSong in order to use it.
    It is also void, which means it does not return any information. It should be marked private so that it can
    only be used in this class. Since I need to access it for testing purposes, it must be public.
     */
    public void goTeam(String a) {
        // Add any print statements you think should go in this method.
        System.out.println("Go " + a + " go!!");
        System.out.println("You can do it!");
    }

    // Create any additional methods you need in this space in order to fulfill the requirements of the program
    public void cheer(String b) {
        System.out.println("You're the best,");
        System.out.println("In the " + b + "!!");
    }
    public void fullSong(String a, String b){
        goTeam(a);
        cheer(b);
    }
    public static void main(String[] args) {
        // No print statements should be in here, only method calls
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the mascot?");
        String mascot = scan.nextLine();
        System.out.println("What's the school's region?");
        String region = scan.nextLine();
        FightSong userSong = new FightSong();
        userSong.fullSong(mascot, region);
    }
}
