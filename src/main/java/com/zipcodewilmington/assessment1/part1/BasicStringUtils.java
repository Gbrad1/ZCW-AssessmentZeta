package com.zipcodewilmington.assessment1.part1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String upperCase = str.substring(0, 1).toUpperCase();
        String toRet = upperCase + str.substring(1);
        return toRet;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        //We created a new array of type char to put each letter from the str provided in the paremeter.
        char[] reversedString = str.toCharArray();
        //index and end created to control the while loop.
        int index = 0;
        int end = reversedString.length - 1;
        //temporary does what it states. I am storing the current character here to move
        //to a new string.
        char temporary;
        //using sout to check the reversedString
        System.out.println(reversedString);
        while (end > index) {
            //temporary holds the
            temporary = reversedString[index];
            //setting the last index of reversedString to the first position of our new array.
            reversedString[index] = reversedString[end];
            //sets the index of end to temporary or a character in this case.
            reversedString[end] = temporary;
            end--;
            index++;
        } return new String(reversedString);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedString = reverse(str);
        String firstCapitalLetter = reversedString.substring(0,1).toUpperCase();
        String finalString = firstCapitalLetter + reversedString.substring(1);
        return finalString;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String withoutFirstLetterAndLastLetter = str.substring(1, str.length() - 1);
        return withoutFirstLetterAndLastLetter;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String newString = "";
        char[] arrayToInvert = str.toCharArray();
        for (int i = 0; i < arrayToInvert.length; i++) {
            if (Character.isUpperCase(arrayToInvert[i])) {
                arrayToInvert[i] = Character.toLowerCase(arrayToInvert[i]);
            } else if (Character.isLowerCase(arrayToInvert[i])) {
                arrayToInvert[i] = Character.toUpperCase(arrayToInvert[i]);
            }
        }
        newString = new String(arrayToInvert);
        return newString;
    }
}
