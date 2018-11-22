public class StringConverter {

    public static int convert_String_To_Number(String numStr) {

        if (numStr == null || numStr.length() == 0) {
            throw new IllegalArgumentException("Input string has incorrect format.");
        }

        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int) '0';
        for (char c : ch) {
            int tmpAscii = (int) c;
            sum = (sum * 10) + (tmpAscii - zeroAscii);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("\"3256\" == " + convert_String_To_Number("3256"));
        System.out.println("\"76289\" == " + convert_String_To_Number("76289"));
        System.out.println("\"90087\" == " + convert_String_To_Number("90087"));
    }
}
