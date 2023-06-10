package se.lunest.radixrevolution.model;

/**
 * Converts numbers between different bases.
 */
public class NumberSystemConverter {

    /**
     * Converts a decimal number to its binary representation.
     *
     * @param decimal the decimal number to convert.
     * @return the binary representation of the decimal number.
     */
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

    /**
     * Converts a binary number to its decimal representation.
     *
     * @param binary the binary number to convert.
     * @return the decimal representation of the binary number.
     */
    public String convertFromBinaryToDecimal(String binary) {
        binary = reverseString(binary);
        int decimal = calculateDecimal(binary);
        return String.valueOf(decimal);
    }

    /**
     * Converts a decimal number to its octal representation.
     *
     * @param decimal the decimal number to convert.
     * @return the octal representation of the decimal number.
     */
    public String convertFromDecimalToOctal(String decimal) {
        StringBuilder octal = new StringBuilder();
        int decimalInteger = Integer.parseInt(decimal);

        while (decimalInteger > 0) {
            int remainder = decimalInteger % 8;
            octal.insert(0, remainder);
            decimalInteger /= 8;
        }

        return octal.toString();
    }

    /**
     * Converts an octal number to its decimal representation.
     *
     * @param octal the octal number to convert.
     * @return the decimal representation of the octal number.
     */
    public String convertFromOctalToDecimal(String octal) {
        octal = reverseString(octal);
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            decimal += Character.getNumericValue(octal.charAt(i)) * (int) Math.pow(8, i);
        }
        return String.valueOf(decimal);
    }

    /**
     * Converts a decimal number to its hexadecimal representation.
     *
     * @param decimal the decimal number to convert.
     * @return the hexadecimal representation of the decimal number.
     */
    public String convertFromDecimalToHexadecimal(String decimal) {
        StringBuilder hexa = new StringBuilder();
        int decimalInteger = Integer.parseInt(decimal);

        while (decimalInteger > 0) {
            int remainder = decimalInteger % 16;
            hexa.insert(0, getHexDigit(remainder));
            decimalInteger /= 16;
        }

        return hexa.toString();
    }

    /**
     * Converts a hexadecimal number to its decimal representation.
     *
     * @param hexadecimal the hexadecimal number to convert.
     * @return the decimal representation of the octal number.
     */
    public String convertFromHexadecimalToDecimal(String hexadecimal) {
        hexadecimal = reverseString(hexadecimal);
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            decimal += Character.getNumericValue(hexadecimal.charAt(i)) * (int) Math.pow(16, i);
        }
        return String.valueOf(decimal);
    }

    private char getHexDigit(int remainder) {
        if (remainder >= 10 && remainder <= 15) {
            return (char) ('A' + (remainder - 10));
        } else {
            return (char) ('0' + remainder);
        }
    }

    private int calculateDecimal(String binary) {
        int decimal = 0;
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
