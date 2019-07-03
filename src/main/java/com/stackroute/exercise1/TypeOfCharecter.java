package com.stackroute.exercise1;

import java.util.Scanner;

public class TypeOfCharecter {

    //function for the displaying type of charecter using ascii values

    public String charType(char charecter){
        String result="";
        if(charecter>=65 && charecter<=90)
        {
            result="Capital Letter";
        }
        else if(charecter>=97 && charecter<=122)
        {
            result= "Small Letter";
        }
        else if(charecter>=48 && charecter<=57)
        {
            result="Digit";
        }
        else if((charecter>0 && charecter<=47) || (charecter>=58 && charecter<=64) || (charecter>=91 && charecter<=96) || (charecter>=123 && charecter<=127))
        {
            result= "Special Symbol";
        }
        else{
            result="enter a charecter or digit or special symbol";
        }
        return result ;
    }
}
