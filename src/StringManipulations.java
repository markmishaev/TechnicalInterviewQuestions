public class StringManipulations {

    public static String removeCharFromString(String input, char charToRemove) {
        StringBuilder sb = new StringBuilder();

        if (input == null) {
            throw new IllegalArgumentException("Invalid argument.");
        }

        char[] stringsCharArray = input.toCharArray();

        for (char c : stringsCharArray) {
            if (c != charToRemove) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String removeCharFromStringRecursive(String input, char charToRemove) {

        if (input == null) {
            throw new IllegalArgumentException("Invalid argument.");
        }

        int index = input.indexOf(charToRemove);

        if (index == -1) {
            return input;
        } else {
            return removeCharFromStringRecursive(input.substring(0, index) + input.substring(index + 1), charToRemove);
        }
    }
}
