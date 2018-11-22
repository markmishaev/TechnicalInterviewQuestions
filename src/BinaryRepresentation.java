public class BinaryRepresentation {

    public static String intToBinary(int numberToConvert) {
        String result = new String();

        while (numberToConvert > 0) {
            result = (numberToConvert % 2 == 0 ? "0" : "1") + result;
            numberToConvert /= 2;
        }

        return result;
    }

    public static int numberOfOnesInBinaryRepresentation(int number) {
        String binaryRepresentation = intToBinary(number);

        int numberOfOnes = 0;

        for (char c : binaryRepresentation.toCharArray()) {
            if(c == '1')
            {
                numberOfOnes++;
            }
        }

        return numberOfOnes;
    }
}
