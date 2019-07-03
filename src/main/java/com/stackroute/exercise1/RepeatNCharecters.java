package com.stackroute.exercise1;


public class RepeatNCharecters {

    //function for repeating the given number of charecters

    public String repeat(String str, int number) {
        if (str != " ") {
            String var = str;
            int length = str.length(); // string length function in-built
            if(length>=number) {
                int repeat = length - number;
                for (int i = 0; i < number; i++) {
                    var += str.substring(repeat);
                }
                return var;
            }
            else {
                return "enter number lessthan string length";
            }
        } else {
            return "enter string";
        }
    }
}


