package com.stackroute.exercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInDsending
{
    public  String sort(int number)
    {
        String var="";

        List<Integer> number_list= new ArrayList<>();
        List<String> strin_list= new ArrayList<>();
        for (int i = number; i > 0; i /= 10)
            number_list.add(i % 10);
        Collections.sort(number_list);  // sorting list in ascending order
        Collections.reverse(number_list); //sorting list in descending order
        for(int i=0;i< number_list.size();i++)
        {
            var+=number_list.get(i);
        }
        return var;
    }
}