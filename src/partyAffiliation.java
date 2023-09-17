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
        if (line.equals("R")) {
            System.out.println("You are a Republican Elephant! ");
        } else if (line.equals("D")) {
            System.out.println("You are a Democratic Donkey! ");
        }
		else if (line.equals("I")) {
            System.out.println("You are a Independent Man! ");
        }
        else if (line.equals("O")) {
            System.out.println("You are a other party");
        }

    }
}