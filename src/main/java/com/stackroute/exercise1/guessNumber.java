package com.stackroute.exercise1;

import java.util.*;
import java.util.Random;


public class guessNumber {
//function to compare given number with original number
    public String  compare(int num1, int num2)
    {
        String variable;
            if (num1 > num2) {
                variable="number guessed is more than original number";
            } else if (num1 < num2) {
                variable="number guessed is less than original number";
            } else {
                variable="number guessed is matches original number";

            }
            return variable;
    }
}
