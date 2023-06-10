package se.lunest.radixrevolution.controller;

import se.lunest.radixrevolution.model.NumberSystemConverter;

public class ConverterController {

    private NumberSystemConverter converter = new NumberSystemConverter();
    
    public String convertFromDecimalToBinary(String decimal) {
        return converter.convertFromDecimalToBinary(decimal);
    }

    public String convertFromBinaryToDecimal(String binary) {
        return converter.convertFromBinaryToDecimal(binary);
    }

}
