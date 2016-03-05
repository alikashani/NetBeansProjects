/*
    Name: Mohammad Ali Kashani
    Student ID: 733768
    Professor: Howard Dachslager, Albert Murtz
    Course: CS 38 - Java Programming

    This program takes input of numbers of quarters, dimes, and nickels
        and outputs the total amount in dollars.
 */
package coins;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coins {

    public static void main(String[] args) {
       
        int quarters,
            dimes,
            nickels;
        double totalInCents,
               totalInDollars;
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat totalPattern = new DecimalFormat("$0.00");
        
        System.out.print("Enter number of quarters: ");
        quarters = scan.nextInt();
        System.out.println("Number of quarters: " + quarters);
        
        System.out.print("Enter number of dimes: ");
        dimes = scan.nextInt();
        System.out.println("Number of dimes: " + dimes);
        
        System.out.print("Enter number of nickels: ");
        nickels = scan.nextInt();
        System.out.println("Number of nickels: " + nickels);
        
        totalInCents = (quarters * 25) + (dimes * 10) + (nickels * 5);
        totalInDollars = totalInCents / 100;
        
        System.out.println("\nYour total amount is: " + totalPattern.format(totalInDollars));
        
    }
    
}
