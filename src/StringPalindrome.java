public class StringPalindrome {

    public static boolean checkIfPalindrome(String input)
    {
        if(input == null || input.length() == 0)
        {
            throw new IllegalArgumentException("Input string has incorrect format.");
        }

//        String reverseString = new StringBuffer(input).reverse().toString();

        String reverseString = new String();

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char currentChar = input.charAt(i);
            reverseString += currentChar;
        }

        return input.equals(reverseString);
    }
}
