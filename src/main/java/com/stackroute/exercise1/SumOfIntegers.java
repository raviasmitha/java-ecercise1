package com.stackroute.exercise1;
import java.util.*;

public class SumOfIntegers {

    // function for sum of digits

    public String sumDigits(String number)
    {
        if(number!=null || number != ""){
        String[] numberString=number.split(" "); // split the string using space
        int sum=0;
        int numbers[]=new int[numberString.length];

        for(int i=0;i<numberString.length;i++)
        {
            numbers[i]=Integer.parseInt(numberString[i]); // convert string to number
            sum+=numbers[i];
        }
        return Integer.toString(sum); // convert number to string
    }
        else {
            return "should not be null or empty";
        }
    }
}