package com.inguarus.StringTasks;

/*
International Morse Code defines a standard encoding where
each letter is mapped to a series of dots and dashes, as follows:
"a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
Now, given a list of words, each word can be written as a concatenation
of the Morse code of each letter.
For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
We'll call such a concatenation, the transformation of a word.
Return the number of different transformations among all words we have.
 */

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