package se.lunest.radixrevolution.view;

import se.lunest.radixrevolution.model.NumberSystemConverter;

public class View {
    

    public static void main(String[] args) {
        NumberSystemConverter numberConverter = new NumberSystemConverter();
        String binary = numberConverter.convertFromDecimalToBinary(32);
        System.out.println(binary);

        int decimal = numberConverter.convertFromBinaryToDecimal("100010111001010");
        System.out.println(decimal);
    }

}
