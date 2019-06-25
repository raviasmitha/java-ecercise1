package com.stackroute.exercise1;

import java.util.Scanner;

public class stringReverse {
    //function for reversing string
    public void reverse(String st,int len)
    {
        String reversestring="";
        for (int i = len - 1; i >= 0; i--)
        {
            reversestring = reversestring+  st.charAt(i);
        }

        System.out.println("String before reversing: " + st);
        System.out.println("String after reversing: " + reversestring);
    }
        public static void main(String args[])
        {
            stringReverse obj = new stringReverse();
            String originalString;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string");
            originalString = sc.nextLine(); //input
            int length = originalString.length(); // finding length of string using string length functon
            obj.reverse(originalString,length);
        }
}
