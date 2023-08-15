package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isAnagram_shouldReturnTrue() {
        assertTrue(Main.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram_shouldReturnFalse() {
        assertFalse(Main.isAnagram("rat", "car"));
    }

    @Test
    void isAnagram_shouldReturnFalse_onDifferentLengths() {
        assertFalse(Main.isAnagram("aa", "ab"));
    }
}