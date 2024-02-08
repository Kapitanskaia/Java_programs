package classes;

import java.util.Scanner;

/**
 * <b>Description</b>
 * <br>Consider a company of friends visiting a restaurant.
 * They decided to equally split the bill.
 * Friends decided to add 10 percent of the bill total amount as tips.
 * Then they cover the total payment in equal parts.
 * This program reads <em>a bill total amount and a number of friends</em>,
 * and then prints part to pay <i>(all integers)</i>.
 */
public class GoDutch {
    public static void main(String[] args) {
        System.out.println("Bill total amount:");
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        System.out.println("Number of friends:");
        int friends = scan.nextInt();
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }
        double part = (bill * 1.1) / friends;
        int result = (int) part;
        System.out.println("Part to pay: " + result);
    }
}