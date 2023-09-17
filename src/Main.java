import com.sun.management.HotSpotDiagnosticMXBean;

import java.net.SocketTimeoutException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0.0;
        double shipping = 0.0;
        double totalPrice = 0.0;

        System.out.println("What is the price of your item? ");
        price = in.nextDouble();
        if (price >= 100){
            shipping = price * .02;
            totalPrice = price + shipping;
            System.out.println("The cost of shipping is " + shipping + " and the cost of your item is " + totalPrice);
        } else if(price < 100){
            System.out.println("The cost of your item is " + price);

        }
    }
}