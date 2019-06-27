package com.stackroute.exercise1;

import java.util.Scanner;

public class stringReverse {
    //function for reversing string
    public String reverse(String str)
    {
        if (str == null || str.isEmpty())
        {
            return str;
        }
        else
        {
            String reverse = "";
            for (int i = str.length() - 1; i >=0; --i) {
                reverse = reverse+ str.charAt(i);
            }
            return reverse;
        }

    }
}
