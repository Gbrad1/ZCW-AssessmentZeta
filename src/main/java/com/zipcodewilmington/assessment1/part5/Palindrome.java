package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer count = 0;
        String toCheck = "";
        for (int i = 0; i <= input.length(); i++) {
            for (int s = i + 1; s <= input.length(); s++) {
                toCheck = input.substring(i, s);
                String reversed = new StringBuilder(toCheck).reverse().toString();
                if (toCheck.equals(reversed)) {
                    count++;
                }
            }
        }
        return count;
    }
}
