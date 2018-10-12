import DataOutImplements.*;
import DataInImplements.*;
import Interfaces.*;


public class AppWithDI {

    //***********************************************************************

    private DataIn dataIn; // <--------- 1 DI ---------
    private DataOut dataOut; // <--------- 2 DI ---------

    public AppWithDI(DataIn dataIn, DataOut dataOut) {
        this.dataIn = dataIn;
        this.dataOut = dataOut;
    }

    public void start() {
        dataOut.useData(dataIn.getData()); // <--------- App logic
    }
    //***********************************************************************

    public static void main(String[] args) {

        AppWithDI app1 = new AppWithDI(new SimpleTextProvider(), new TextPrinter());
        app1.start();

        AppWithDI app2 = new AppWithDI(new SimpleTextProvider(), new RainbowRandomTextPrinter());
        app2.start();

        AppWithDI app3 = new AppWithDI(new ManualInputTextProvider(), new TextPrinter());
        app3.start();

        AppWithDI app4 = new AppWithDI(new ManualInputTextProvider(), new RainbowRandomTextPrinter());
        app4.start();

    }
}








