package se.lunest.radixrevolution.model;

/**
 * Converts numbers between decimal and two's complement representations.
 */
public class TwosComplementConverter {

    private NumberSystemConverter converter;

    /**
     * Constructs a TwosComplementConverter object.
     */
    public TwosComplementConverter() {
        converter = new NumberSystemConverter();
    }

    /**
     * Converts a decimal number to its two's complement representation.
     *
     * @param decimal the decimal number to convert.
     * @return the two's complement representation of the decimal number.
     */
    public String convertFromDecimalToTwosComplement(String decimal, String bits) {
        int decimalInteger = Integer.parseInt(decimal);
        int bitSize = Integer.parseInt(bits);

        validateBitSize(bitSize);

        int maxValue = calculateMaxValue(bitSize);
        int minValue = calculateMinValue(bitSize);

        validateDecimalValue(decimalInteger, minValue, maxValue, bits);

        if (decimalInteger >= 0) {
            return extendPositiveNumber(decimalInteger, bitSize);
        }

        return convertNegativeNumber(decimalInteger, bitSize);
    }

    private void validateBitSize(int bitSize) {
        if (bitSize < 2 || bitSize > Integer.SIZE) {
            throw new IllegalArgumentException("Invalid bitsize: " + bitSize);
        }
    }

    private int calculateMaxValue(int bitSize) {
        return (1 << (bitSize - 1)) - 1;
    }

    private int calculateMinValue(int bitSize) {
        return -(1 << (bitSize - 1));
    }

    private void validateDecimalValue(int decimalInteger, int minValue, int maxValue, String bitSize) {
        if (decimalInteger < minValue || decimalInteger > maxValue) {
            throw new IllegalArgumentException("Decimal value " + decimalInteger +
                    " cannot be represented using the specified " + bitSize + " bits");
        }
    }

    /**
     * Converts a two's complement representation to its decimal number.
     *
     * @param twosbinary the two's complement binary representation to convert.
     * @return the decimal representation of the two's complement number.
     */
    public String convertFromTwosComplementToDecimal(String twosbinary) {
        int decimal = 0;

        if (twosbinary.charAt(0) == '0') {
            return converter.convertFromBinaryToDecimal(twosbinary);
        }

        twosbinary = reverseString(twosbinary);

        for (int i = 0; i < twosbinary.length(); i++) {
            if (i == twosbinary.length() - 1) {
                decimal += Character.getNumericValue(twosbinary.charAt(i)) * (int) Math.pow(2, i) * -1;
            } else {
                decimal += Character.getNumericValue(twosbinary.charAt(i)) * (int) Math.pow(2, i);
            }
        }

        return String.valueOf(decimal);
    }

    private char getBit(int number, int mask) {
        return (number & mask) == 0 ? '0' : '1';
    }

    private String reverseString(String toReverse) {
        StringBuilder reversed = new StringBuilder(toReverse);
        reversed.reverse();
        return reversed.toString();
    }

    private String extendPositiveNumber(int decimalInteger, int bitSize) {
        StringBuilder binary = new StringBuilder();
        binary.append(converter.convertFromDecimalToBinary(String.valueOf(decimalInteger)));

        if (binary.charAt(0) == '1') {
            binary.insert(0, '0');
        }

        while (binary.length() < bitSize) {
            binary.insert(0, '0');
        }

        return binary.toString();
    }

    private String convertNegativeNumber(int decimalInteger, int bitSize) {
        StringBuilder binary = new StringBuilder();

        int mask = 1 << (bitSize - 1);

        while (mask != 0) {
            binary.append(getBit(decimalInteger, mask));
            mask >>>= 1;
        }

        return binary.toString();
    }

}
