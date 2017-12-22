package app.waste_disposal.io;

import app.waste_disposal.contracts.ConsoleWriter;

public class ConsoleWriterImpl implements ConsoleWriter{

    @Override
    public void writeLine(String string) {
        System.out.println(string);
    }
}
