package com.stackroute.exercise1;
public class repeatNCharecters {
    //function for repeating the given number of charecters
    public String repeat(String str,int number){
        String var=str;
        int length=str.length(); // string length function in-built
        int repeat=length-number;
        for(int i=0;i<number;i++)
        {
            var+=str.substring(repeat);
        }
        return var;
    }
}

