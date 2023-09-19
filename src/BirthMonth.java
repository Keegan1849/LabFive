import java.util.Scanner;


public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your birth month? ");
        int birthMonth = Integer.parseInt(in.nextLine());
        if (birthMonth > 12 && birthMonth > 1){
            System.out.println("That is an invalid age: " + birthMonth);
        } else {
            System.out.println("Your birth month is: " + birthMonth);

        }
    }
}