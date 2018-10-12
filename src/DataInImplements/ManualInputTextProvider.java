package DataInImplements;

import Interfaces.DataIn;

import java.util.Scanner;

public class ManualInputTextProvider implements DataIn {
    @Override
    public String getData() {
        return getText();
    }

    private String getText() {
        System.out.println("please input your text:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
