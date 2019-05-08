package com.inguarus.string_tasks;

/*
  Given a string, you need to reverse the order of characters in each word
within a sentence while still preserving whitespace and initial word order.
  Note: In the string, each word is separated by single space and there will
not be any extra space in the string.
 */

public class ReverseWords {
    public static void main(String[] args) {
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0)
                reverse.append(" ");
            reverse.append(new StringBuilder(words[i]).reverse());
        }
        return reverse.toString();
    }
}