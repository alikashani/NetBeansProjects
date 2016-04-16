package asg;

import java.util.Scanner;

public class ASG {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        int hits;
        int atBats;
        double hitPer;
        
        System.out.print("Please enter number of hits this season: ");
        hits = stdin.nextInt();
        
        System.out.print("Please enter number of at bats this season: ");
        atBats = stdin.nextInt();
        
        hitPer = (double) hits / atBats;
        
        if (hitPer > 0.300)
            System.out.println("Eligible for the All Star Game!");
        else 
            System.out.println("Sorry, not eligible for All Star Game");
    }
    
}
