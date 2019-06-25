package com.stackroute.exercise1;

import java.util.Scanner;

public class oddOrEven {
    //function for findin the number is ood or even
    public void odd(int num)
    {
        if(num>20 & num<30)
        {
            if((num%2)==0)
            {
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
    }
    public static void main(String args[])
    {
        int number;
        oddOrEven obj = new oddOrEven();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        obj.odd(number);
    }
}
