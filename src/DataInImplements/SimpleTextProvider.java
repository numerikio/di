package DataInImplements;

import Interfaces.DataIn;

public class SimpleTextProvider implements DataIn {
    @Override
    public String getData() {
        return "Hi! I'm String of SimpleTextProvider!";
    }
}