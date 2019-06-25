package com.stackroute.exercise1;
import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        long number, reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        number = sc.nextLong();
        System.out.println(number);
        long divisor,sum=0;
        long  num=number;
        //for seperatin each digit
        while(num> 0) {
            divisor=num%10;
            if ((divisor % 2) == 0) {
                sum = sum + divisor; //for performing the sum of the even numbers
            }
            reverse = (reverse * 10) + divisor;//reversing the number
            num = num / 10;
        }
        if(number==reverse){

        }
        if (sum > 25) {
            System.out.println(number + " is a palindrome and the sum of even numbers is greater than 25");
        } else if(sum<25) {
            System.out.println(number + "is a palindrome but the sum of even numbers is lessthan 25");
        }
        else {
            System.out.println(number+"is not a palindrome");
            }
    }
}
