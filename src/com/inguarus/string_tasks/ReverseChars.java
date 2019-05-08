package com.inguarus.string_tasks;

/*
Write a function that reverses a string.
The input string is given as an array_tasks of characters char[].
Do not allocate extra space for another array_tasks, you must do this
by modifying the input array_tasks in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
 */

public class ReverseChars {
    public static void main(String[] args) {
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}

