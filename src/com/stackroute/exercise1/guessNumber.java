package com.stackroute.exercise1;

import java.util.*;
import java.util.Random;


public class guessNumber {
    Scanner sc=new Scanner(System.in);
//function to compare given number with original number
    public void compare(int num1, int num2)
    {
        while(num1!=num2)
        {
            if (num1 > num2) {
                System.out.println("number guessed is more than original number");
            } else if (num1 < num2) {
                System.out.println("number guessed is less than original number");
            } else {
                System.out.println("number guessed is matches original number");

            }
            System.out.println("enter the number");
            num1=sc.nextInt();
        }
    }
    //main function
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);//scanner class to take input

        guessNumber obj = new guessNumber();
        Random random = new Random();
        int num= random.nextInt(100);
        System.out.println("enter the number");
        number=sc.nextInt();
        obj.compare(number,num);


    }
}
