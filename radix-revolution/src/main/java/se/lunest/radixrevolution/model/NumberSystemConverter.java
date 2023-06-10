package se.lunest.radixrevolution.model;

public class NumberSystemConverter {

    public String convertFromDecimalToBinary(String decimal) {
        StringBuilder binary = new StringBuilder();
        int decimalInteger = Integer.parseInt(decimal);

        while (decimalInteger > 0) {
            int remainder = decimalInteger % 2;
            binary.insert(0, remainder);
            decimalInteger /= 2;
        }

        return binary.toString();
    }

    public String convertFromBinaryToDecimal(String binary) {
        int decimal = 0;

        binary = reverseString(binary);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0') {
                decimal += Math.pow(2, i);
            }
        }

        return String.valueOf(decimal);
    }

    private String reverseString(String toReverse) {
        StringBuilder reversed = new StringBuilder(toReverse);
        reversed.reverse();
        return reversed.toString();
    }

}
