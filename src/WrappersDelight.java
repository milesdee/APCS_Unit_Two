public class WrappersDelight {

    // Create a main class and follow the instructions on the Lab sheet to complete this assignment.
    // When finished, uncomment the WrappersDelight.main(null) line in the
    // test file to make sure your program is correct.
    public static void main(String[] args){
        int num1 = 14;
        Integer num2 = new Integer(8);
        double num3 = 2.5;
        Double num4 = num2 + num3;
        num2 = 5;
        num3 = num1 + num2 + num4;
        num1 = (int)(num2 + num4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

}
