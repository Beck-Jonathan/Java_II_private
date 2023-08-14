package en.codegym.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

/* 
Verifying existence
*/

public class Solution {
    public static Set<String> words = new HashSet<>(asList("If they asked me to choose a language to replace Java I wouldn't choose".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("The word " + word + " is in the set");
        } else {
            System.out.println("The word " + word + " is not in the set");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
