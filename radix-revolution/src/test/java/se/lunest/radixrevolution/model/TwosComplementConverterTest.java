package se.lunest.radixrevolution.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TwosComplementConverterTest {

    private TwosComplementConverter complementConverter;

    @BeforeEach
    public void prepareTest() {
        complementConverter = new TwosComplementConverter();
    }

    @AfterEach
    public void cleanup() {
        complementConverter = null;
    }

    @Test
    public void testConvertFromDecimalToTwosComplementWithPositiveDecimal() {
        // Arrange
        String decimal = "106";
        String bitsize = "16";
        String expectedResult = "0000000001101010";

        // Act
        String actualResult = complementConverter.convertFromDecimalToTwosComplement(decimal, bitsize);

        // Assert
        assertEquals(expectedResult, actualResult, "Expected bit result not the same as actual bit result.");
    }

    @Test
    public void testConvertFromDecimalToTwosComplementWithNegativeDecimal() {
        // Arrange
        String decimal = "-97";
        String bitsize = "32";
        String expectedResult = "11111111111111111111111110011111";

        // Act
        String actualResult = complementConverter.convertFromDecimalToTwosComplement(decimal, bitsize);

        // Assert
        assertEquals(expectedResult, actualResult, "Expected bit result not the same as actual bit result.");
    }

    @Test
    public void testConvertFromDecimalToTwosComplementWitIncorrectBits() {
        // Arrange
        String decimal = "8";
        String bitSize = "4";

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> complementConverter.convertFromDecimalToTwosComplement(decimal, bitSize),
                "IllegalArgumentException expected to be thrown, but it was not.");
    }

    @Test
    public void testConvertFromTwosComplementToDecimalWithNegativeTwosComplement() {
        // Arrange
        String twosbinary = "11101101";
        String expectedResult = "-19";

        // Act
        String actualResult = complementConverter.convertFromTwosComplementToDecimal(twosbinary);

        // Assert
        assertEquals(expectedResult, actualResult, "Actual binary is not same as expected binary.");
    }

    @Test
    public void testConvertFromTwosComplementToDecimalWithPositiveTwosComplement() {
        // Arrange
        String twosbinary = "01101101";
        String expectedResult = "109";

        // Act
        String actualResult = complementConverter.convertFromTwosComplementToDecimal(twosbinary);

        // Assert
        assertEquals(expectedResult, actualResult, "Actual binary is not same as expected binary.");
    }

}
