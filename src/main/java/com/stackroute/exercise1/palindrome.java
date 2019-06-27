package com.stackroute.exercise1;

public class palindrome {
    public String isPalindrome(long num) {
        long divisor, sum = 0, reverse = 0;
        String result = "";
        long number = num;
        while (num > 0) {
            divisor = num % 10;
            reverse = (reverse * 10) + divisor;//reversing the number
            num = num / 10;
        }
        if (number == reverse) {
            result = "Palindrome";
        } else {
            result = "not a palindrome";
        }
        return result;
    }

    public String sum(int num) {
        long divisor, sum = 0;
        while (num > 0) {
            divisor = num % 10;
            if ((divisor % 2) == 0) {
                sum = sum + divisor;
            }

            num = num / 10;
        }
        if (sum > 25)
            return "true";
            else
            return "false";

    }
}