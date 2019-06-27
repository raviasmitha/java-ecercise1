package com.stackroute.exercise1;

import java.util.Scanner;

public class oddOrEven {
    //function for findin the number is ood or even
    public String checkOddEven(int num)
    {
        String var="";
        if(num>20 & num<30)
        {
            if((num%2)==0)
            {
                var="Jerry";
            }
            else{
                var="Tom";
            }
        }
        else {
            var="NotTomNotJerry";
        }
        return var;
    }
}
