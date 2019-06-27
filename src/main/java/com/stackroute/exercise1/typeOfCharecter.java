package com.stackroute.exercise1;

import java.util.Scanner;

public class typeOfCharecter {
    //function for the displaying type of charecter using ascii values
    public String charType(char charecter){
        String var="";
        if(charecter>=65 && charecter<=90)
        {
            var="Capital Letter";
        }
        else if(charecter>=97 && charecter<=122)
        {
            var= "Small Letter";
        }
        else if(charecter>=48 && charecter<=57)
        {
            var="Digit";
        }
        else if((charecter>0 && charecter<=47) || (charecter>=58 && charecter<=64) || (charecter>=91 && charecter<=96) || (charecter>=123 && charecter<=127))
        {
            var= "Special Symbol";
        }
        return var ;
    }
}
