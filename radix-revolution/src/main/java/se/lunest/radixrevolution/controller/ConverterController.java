package se.lunest.radixrevolution.controller;

import se.lunest.radixrevolution.model.NumberSystemConverter;
import se.lunest.radixrevolution.model.TwosComplementConverter;

/**
 * Handles the management of the calls to the model.
 */
public class ConverterController {

    private NumberSystemConverter converter;
    private TwosComplementConverter complementConverter;

    /**
     * Instantiates necessary converters.
     */
    public ConverterController() {
        converter = new NumberSystemConverter();
        complementConverter = new TwosComplementConverter();
    }

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

    /**
     * Converts a decimal number to its two's complement representation.
     *
     * @param decimal the decimal number to convert.
     * @param bits the number of bits wanted.
     * @return the two's complement representation of the decimal number.
     */
    public String convertFromDecimalToTwosComplement(String decimal, String bits) {
        return complementConverter.convertFromDecimalToTwosComplement(decimal, bits);
    }

    /**
     * Converts a two's converter number to its decimal representation.
     *
     * @param twosbinary the two's complement number to convert.
     * @return the decimal representation of the two's complement number.
     */
    public String convertFromTwosComplementToDecimal(String twosbinary) {
        return complementConverter.convertFromTwosComplementToDecimal(twosbinary);
    }

}
