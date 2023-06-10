package se.lunest.radixrevolution.view;

import se.lunest.radixrevolution.controller.ConverterController;

/**
 * A dummy view.
 */
public class View {

    public static void main(String[] args) {

        ConverterController controller = new ConverterController();

        String output = controller.convertFromDecimalToBinary("942");
        System.out.println(output);

        output = controller.convertFromBinaryToDecimal("1110101110");
        System.out.println(output);

        output = controller.convertFromDecimalToOctal("930");
        System.out.println(output);

        output = controller.convertFromOctalToDecimal("1642");
        System.out.println(output);

        output = controller.convertFromDecimalToHexadecimal("237");
        System.out.println(output);

        output = controller.convertFromHexadecimalToDecimal("ED");
        System.out.println(output);
        
    }

}
