package rng;

import java.util.Random;

public class RNG {

    public static void main(String[] args) {
        
        Random rng = new Random();
        
        int a = rng.nextInt(50) + 1;
        int b = rng.nextInt(50) + 1;
        int c = rng.nextInt(50) + 1;
        
        double avg = (double) (a + b + c) / 3;
        
        System.out.printf("The average of the 3 random numbers is %.2f\n", avg);

    }
    
}
