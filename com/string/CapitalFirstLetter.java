package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class CapitalFirstLetter {
    static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as  a value
 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(map.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
            	map.put(c, map.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
            	map.put(c, 1);
            }
        }
 
        //Printing the charCountMap
 
        System.out.println(map);
    }
 
    public static void main(String[] args)
    {
      // characterCount("Java J2EE Java JSP J2EE");
 
       characterCount("Manoj Manoj");
 
       //characterCount("Done And Gone");
    }
}

