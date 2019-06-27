package com.stackroute.exercise1;

public class Loop {
    public String looping(int n) //function to print numbers in loop
    {
        int number,repeate;
        String var="";
        for(number=1;number<=n;number++)
        {
            for(repeate=1;repeate<=number;repeate++)
            {
                var+=number;
            }
        }
        return var;
    }
}