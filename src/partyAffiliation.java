import java.util.Scanner;

public class partyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String rep = "R";
        String dem = "D";
        String ind = "I";
        String oth = "O";
        System.out.println("What is your party affiliation? [R,D,I,O]");
        String line = in.nextLine();
        switch (line) {
            case "R":
                System.out.println("You are a Republican Elephant! ");
                break;
            case "D":
                System.out.println("You are a Democratic Donkey! ");
                break;
            case "I":
                System.out.println("You are a Independent Man! ");
                break;
            case "O":
                System.out.println("You are a other party");
                break;
        }

    }
}