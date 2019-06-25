package com.stackroute.exercise1;

import java.util.Scanner;

public class typeOfCharecter {
    //function for the displaying type of charecter using ascii values
    public void charType(char charecter){
        if(charecter>=65 && charecter<=90)
        {
            System.out.println("Capital Letter");
        }
        else if(charecter>=97 && charecter<=122)
        {
            System.out.println("Small Letter");
        }
        else if(charecter>=48 && charecter<=57)
        {
            System.out.println("Digit");
        }
        else if((charecter>0 && charecter<=47) || (charecter>=58 && charecter<=64) || (charecter>=91 && charecter<=96) || (charecter>=123 && charecter<=127))
        {
            System.out.println("Special Symbol");
        }
    }
    public static void main(String args[])
    {
        typeOfCharecter obj =   new typeOfCharecter();
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter charter");
        ch = sc.next().charAt(0);
        obj.charType(ch);

    }
}
