package com.inguarus.string_tasks;

/*
Given a string, find the first non-repeating character in it
and return it's index. If it doesn't exist, return -1.
You may assume the string contain only lowercase letters.
 */

public class UniqueCharacter {

    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {

        if (s == null || s.equals("")) return -1;
        char[] c = s.toCharArray();
        int[] cnt = new int[256];

        for (int i = 0; i < c.length; i++) {
            cnt[c[i]]++;
        }

        for (int i = 0; i < c.length; i++) {
            if (cnt[c[i]] == 1) return i;
        }
        return -1;
    }
}
