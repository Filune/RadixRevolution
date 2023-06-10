package se.lunest.radixrevolution.model;


import org.junit.jupiter.api.Test;

import se.lunest.radixrevolution.controller.ConverterController;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class NumberSystemConverterTest {

    private ConverterController converter;

    @BeforeEach
    public void prepareTest() {
        converter = new ConverterController();
    }

    @AfterEach
    public void cleanup() {
        converter = null;
    }
    
    @Test
    public void testConvertFromBinaryToDecimal() {
        // Arrange
        String binary = "1110101110";
        String expectedResult = "942";

        // Act
        String actualResult = converter.convertFromBinaryToDecimal(binary);

        // Assert
        assertEquals(expectedResult, actualResult, "The expected decimal does not match actual decimal.");
    }

    @Test
    public void testConvertFromDecimalToBinary() {
        // Arrange
        String decimal = "33";
        String expectedResult = "100001";

        // Act
        String actualResult = converter.convertFromDecimalToBinary(decimal);

        // Assert
        assertEquals(expectedResult, actualResult, "The expected binary does not match the actual binary.");
    }

}
