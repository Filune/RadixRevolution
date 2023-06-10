package se.lunest.radixrevolution.view;

import se.lunest.radixrevolution.controller.ConverterController;

public class View {

    public static void main(String[] args) {

        ConverterController controller = new ConverterController();

        String output = controller.convertFromDecimalToBinary("942");
        System.out.println(output);

        output = controller.convertFromBinaryToDecimal("1110101110");
        System.out.println(output);
    }

}
