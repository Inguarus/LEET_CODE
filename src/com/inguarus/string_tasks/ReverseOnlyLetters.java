package com.inguarus.string_tasks;

/*
Given a string S, return the "reversed" string where all characters that are not
a letter stay in the same place, and all letters reverse their positions.
 */

public class ReverseOnlyLetters {
    public static void main(String[] args) {
    }

    public static String reverseOnlyLetters(String S) {
        int i = 0;
        int j = S.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(S);

        while (i < j) {
            char a = S.charAt(i);
            char b = S.charAt(j);

            while (!(65 <= a && a < 91 || 97 <= a && a <= 123) && i < j) {
                i++;
                a = S.charAt(i);
            }
            while (!(65 <= b && b < 91 || 97 <= b && b <= 123) && i < j) {
                j--;
                b = S.charAt(j);
            }

            stringBuilder.setCharAt(i, b);
            stringBuilder.setCharAt(j, a);
            i++;
            j--;
        }
        return stringBuilder.toString();
    }
}
