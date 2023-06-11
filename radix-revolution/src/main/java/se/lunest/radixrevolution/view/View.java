package se.lunest.radixrevolution.view;

import se.lunest.radixrevolution.controller.ConverterController;

/**
 * A dummy view with hardcoded calls.
 */
public class View {

    public void sample() {

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

        output = controller.convertFromDecimalToTwosComplement("-924", "19");
        System.out.println(output);

        output = controller.convertFromTwosComplementToDecimal("010101111");
        System.out.println(output);
        
    }
}
