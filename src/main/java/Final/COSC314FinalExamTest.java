package Final;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class COSC314FinalExamTest {

    @Test
    @DisplayName("Power Set Test")
    void powerSet() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "1", "2", "12", "3", "13", "23", "123"));
        char[] set = {'1', '2', '3'};
        ArrayList<String> result = COSC314FinalExam.PowerSet(set, 3);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    @DisplayName("Power Set Test Letters")
    void powerSetTest() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "a", "b", "ab", "c", "ac", "bc", "abc", "d", "ad", "bd", "abd", "cd", "acd", "bcd", "abcd"));
        char[] set = {'a', 'b', 'c', 'd'};
        ArrayList<String> result = COSC314FinalExam.PowerSet(set, 4);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    @DisplayName("Power Set Test 3")
    void powerSetTest3() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "2", "4", "24", "6", "26", "46", "246", "8", "28", "48", "248", "68", "268", "468", "2468"));
        char[] set = {'2', '4', '6', '8'};
        ArrayList<String> result = COSC314FinalExam.PowerSet(set, 4);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    @DisplayName("Power Set Test 4")
    void powerSetTest4() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("", "8", "7", "87", "9", "89", "79", "879"));
        char[] set = {'8', '7', '9'};
        ArrayList<String> result = COSC314FinalExam.PowerSet(set, 3);
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}

