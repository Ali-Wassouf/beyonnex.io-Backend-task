package org.example;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var array = new int[26];
        for (var character : s.toCharArray()) {
            array[character - 'a']++;
        }
        for (var character : t.toCharArray()) {
            var index = character - 'a';
            array[index]--;
            if (array[index] < 0) {
                return false;
            }
        }
        return true;
    }
}