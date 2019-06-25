package com.stackroute.exercise1;

import java.util.Scanner;

public class repeatNCharecters {
    //function for repeating the given number of charecters
    public void repeat(String st,int number){
        System.out.print(st);
        int length=st.length(); // string length function in-built
        int repeat=length-number;
        for(int i=0;i<number;i++)
        {
            System.out.print(st.substring(repeat));
        }
    }
    public static void main(String args[]){
repeatNCharecters obj =new repeatNCharecters();
        String str;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        str=sc.nextLine();
        System.out.println("enter number:");
        num=sc.nextInt();
        obj.repeat(str,num);

    }
}
