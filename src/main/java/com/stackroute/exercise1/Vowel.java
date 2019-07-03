package com.stackroute.exercise1;


public class Vowel
{
    public String vowelConsonantCheck(String word) // function for checking vowel or consonant
    {
        String result="";
        for(int i=0;i<word.length();++i)
        {
            char ch= word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                result+="Vowel";
            }
            else if (ch>='a' && ch<='z')
            {
                result+="Consonant";
            }
            else
            {
                result= "Please enter a valid letter";
            }
        }
        return result;
    }
}
