package DataOutImplements;

import Interfaces.DataOut;
import java.util.Random;

public class RainbowRandomTextPrinter implements DataOut {
    private final String reset = "\u001B[0m";

    private final String red = "\u001B[31m";
    private final String green = "\u001B[32m";
    private final String yellow = "\u001B[33m";
    private final String blue = "\u001B[34m";
    private final String purple = "\u001B[35m";
    private final String cyan = "\u001B[36m";
    private final String white = "\u001B[37m";

    String[] radu = {red, green, yellow, blue, purple, cyan, white};

    @Override
    public void useData(String data) {
        for (int i = 0; i < data.length(); i++) {
            Random random = new Random();
            System.out.print(radu[random.nextInt(radu.length - 1)] + data.charAt(i) + reset);
        }
        System.out.println();
    }
}