package com.stackroute.exercise1;

import java.util.Scanner;

public class vowel {
    //function to find the letter is vowel or consonant
    public void find(String wrd)
    {
        char letter;
        for(int i=0;i< wrd.length();i++)
        {
            letter=wrd.charAt(i);//string function
            if(letter == 'a' || letter=='e'||letter== 'i' ||letter== 'o' ||letter== 'u')
            {
                System.out.print("vowel\t");
            }
            else{
                System.out.print("consonent\t");
            }
        }
    }
    public static void main(String args[]){
        vowel obj = new vowel();
        String word;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word");
        word=sc.nextLine();
        obj.find(word);

    }
}
