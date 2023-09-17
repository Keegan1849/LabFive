import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = Integer.parseInt(in.nextLine());
        if (age < 21){
            System.out.println("You get a wrist band");

        }
    }
}