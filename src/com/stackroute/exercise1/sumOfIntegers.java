package com.stackroute.exercise1;
import java.util.*;

public class sumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Enter numbers here");
        int sum;
        do {
            Scanner sc = new Scanner(System.in);//scanner to take input
            int number = 0;
            sum = 0;
            String line = sc.nextLine();
            sc = new Scanner(line); //has to do this to make the kb.hasNexInt() work.
            while (sc.hasNextInt()) {
                number = sc.nextInt();
                sum += number;
            }
            if (sum <= -1)
                System.out.println("error");
            else if (sum >= 0)
                System.out.println("Sum = " + sum);

        } while (sum != -1);
    }
}