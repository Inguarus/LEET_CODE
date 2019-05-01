package com.inguarus;

import java.util.HashSet;
import java.util.Set;

class Morse {

    private static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                                          ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                                             "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        final Set<String> morseCode = new HashSet<>();
        for (final String word : words) {
            final StringBuilder stringBuilder = new StringBuilder();
            for (final char resultMorse : word.toCharArray()) {
                stringBuilder.append(MORSE[resultMorse - 'a']);
            }
            morseCode.add(stringBuilder.toString());
        }
        return morseCode.size();
    }

}