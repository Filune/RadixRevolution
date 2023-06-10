package se.lunest.radixrevolution.model;

public class NumberSystemConverter {

    public String convertFromDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public int convertFromBinaryToDecimal(String binary) {
        int decimal = 0;

        binary = reverseString(binary);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0') {
                decimal += Math.pow(2, i);
            }
        }

        return decimal;
    }

    private String reverseString(String toReverse) {
        StringBuilder reversed = new StringBuilder(toReverse);
        reversed.reverse();
        return reversed.toString();
    }

}
