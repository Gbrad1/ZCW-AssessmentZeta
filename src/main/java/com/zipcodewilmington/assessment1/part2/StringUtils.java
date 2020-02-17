package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] newArray = sentence.split(" ");
        String[] buffer = new String[newArray.length];
        int index = 0;
        int outdex = 0;
        while (index < newArray.length) {
            buffer[index] = newArray[index];
            index++;
            outdex++;
        }
        return Arrays.copyOfRange(buffer, 0, outdex);
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] newArray = sentence.split(" ");
        String[] buffer = new String[newArray.length];
        int index = 0;
        int outdex = 0;
        while (index < newArray.length) {
            buffer[index] = newArray[index];
            index++;
            outdex++;
        }
        return buffer[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] newArray = sentence.split(" ");
        String[] buffer = new String[newArray.length];
        int index = 0;
        int outdex = 0;
        while (index < newArray.length) {
            buffer[index] = newArray[index];
            index++;
            outdex++;
        }

        String toReverse = buffer[0];
        String reversed = "";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed = reversed + toReverse.charAt(i);
        }

        return reversed;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] newArray = sentence.split(" ");
        String[] buffer = new String[newArray.length];
        int index = 0;
        int outdex = 0;
        while (index < newArray.length) {
            buffer[index] = newArray[index];
            index++;
            outdex++;
        }

        String toReverse = buffer[0];
        String reversed = "";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed = reversed + toReverse.charAt(i);
        }

        String finalString = reversed.substring(0,1).toUpperCase() + reversed.substring(1);
        return finalString;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return str.substring(0,index) + str.substring(index + 1);
    }

}
