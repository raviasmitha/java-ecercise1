package com.stackroute.exercise1;

public class Loop {
    public String looping(int n) //function to print numbers in loop
    {
        int number, repeate;
        String var = "";
        if (n >= 0) {
            for (number = 1; number <= n; number++) {
                for (repeate = 1; repeate <= number; repeate++) {
                    var += number;
                }
            }
            return var;
        } else {
            return "should give positive numbers";
        }
    }
}