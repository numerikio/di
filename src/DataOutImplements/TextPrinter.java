package DataOutImplements;

import Interfaces.DataOut;

public class TextPrinter implements DataOut {

    @Override
    public void useData(String data) {
        System.out.println(data);
    }
}
