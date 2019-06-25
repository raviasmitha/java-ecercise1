package com.stackroute.exercise1;

import java.util.Scanner;

public class Loop {
    public void looping(int n) //function to print numbers in loop
    {
        int number,repeate;
        for(number=1;number<=n;number++)
        {
            for(repeate=1;repeate<=number;repeate++)
            {
                System.out.print(number+" ");
            }
        }
    }
    public static void main(String args[]) //main function
    {
        Loop obj = new Loop(); //object for the class
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        obj.looping(num); //calling function using object

    }
}
