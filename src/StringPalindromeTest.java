import org.junit.Test;

import static org.junit.Assert.*;

public class StringPalindromeTest {

    @Test
    public void checkIfPalindrome() {
        assertTrue(StringPalindrome.checkIfPalindrome("12321"));
    }
    @Test
    public void checkIfNotPalindrome() {
        assertFalse(StringPalindrome.checkIfPalindrome("1232"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInvalidString()
    {
        StringPalindrome.checkIfPalindrome("");
    }
}