package no.experis.test;

import java.util.regex.Pattern;

public class AnagramCheck {

    public boolean isAnagram(String strA, String strB) {
        // Cleaning the strings (remove white spaces and convert to lowercase)
        strA = strA.replaceAll("\\s+","").toLowerCase();
        strB = strB.replaceAll("\\s+","").toLowerCase();

        // Check every char of strA and removes first occurence of it in strB
        for (int i = 0; i < strA.length(); i++ ) {
            if (strB.equals("")) return false;  // strB is already empty : not an anagram
            strB = strB.replaceFirst(Pattern.quote("" + strA.charAt(i)), "");
        }

        // if strB is empty we have an anagram
        return strB.equals("");
    }



}
//            System.out.println(isAnagram("William Shakespeare", "I am a weakish speller")); // true
