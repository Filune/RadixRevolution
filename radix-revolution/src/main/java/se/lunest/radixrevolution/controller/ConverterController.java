package se.lunest.radixrevolution.controller;

import se.lunest.radixrevolution.model.NumberSystemConverter;

/**
 * Handles the management of the calls to the model.
 */
public class ConverterController {

    private NumberSystemConverter converter = new NumberSystemConverter();
    
    /**
     * Converts a decimal number to its binary representation.
     *
     * @param decimal the decimal number to convert.
     * @return the binary representation of the decimal number.
     */
    public String convertFromDecimalToBinary(String decimal) {
        return converter.convertFromDecimalToBinary(decimal);
    }

    /**
     * Converts a binary number to its decimal representation.
     *
     * @param binary the binary number to convert.
     * @return the decimal representation of the binary number.
     */
    public String convertFromBinaryToDecimal(String binary) {
        return converter.convertFromBinaryToDecimal(binary);
    }

    /**
     * Converts a decimal number to its octal representation.
     *
     * @param decimal the decimal number to convert.
     * @return the octal representation of the decimal number.
     */
    public String convertFromDecimalToOctal(String decimal) {
        return converter.convertFromDecimalToOctal(decimal);
    }

    /**
     * Converts an octal number to its decimal representation.
     *
     * @param octal the octal number to convert.
     * @return the decimal representation of the octal number.
     */
    public String convertFromOctalToDecimal(String octal) {
        return converter.convertFromOctalToDecimal(octal);
    }

    /**
     * Converts a decimal number to its hexadecimal representation.
     *
     * @param decimal the decimal number to convert.
     * @return the hexadecimal representation of the decimal number.
     */
    public String convertFromDecimalToHexadecimal(String decimal) {
        return converter.convertFromDecimalToHexadecimal(decimal);
    }

    /**
     * Converts a hexadecimal number to its decimal representation.
     *
     * @param hexadecimal the hexadecimal number to convert.
     * @return the decimal representation of the hexadecimal number.
     */
    public String convertFromHexadecimalToDecimal(String hexadecimal) {
        return converter.convertFromHexadecimalToDecimal(hexadecimal);
    }

}
