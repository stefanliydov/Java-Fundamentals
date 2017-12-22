package app.engines;


import app.contracts.Battlefield;
import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class EngineImpl implements Engine {

    private Writer writer;
    private Reader reader;
    private Battlefield battleField;

    public EngineImpl(Writer writer, Reader reader, Battlefield battlefield) {
        this.writer = writer;
        this.reader = reader;
        this.battleField = battlefield;
    }

    @Override
    public void run() throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {


        String line = reader.readLine();
        while (!line.equals("Peace")) {
            String[] lineTokens = line.split("\\s+");

            switch (lineTokens[0]) {
                case "CreateParticipant":
                    battleField.createParticipant(lineTokens[1], lineTokens[2]);
                    break;
                case "CreateAction":

                    battleField.createAction(lineTokens[1],
                            Arrays.copyOf(Arrays.stream(lineTokens).skip(2).toArray(),
                                    Arrays.stream(lineTokens).skip(2).toArray().length,
                                    String[].class));
                    break;
                case "StatParticipants":
                    battleField.reportParticipants();
                    break;
                case "StatActions":
                    battleField.reportActions();
                    break;
                default:
                   writer.writeLine("Invalid command");
                    break;
            }

            line = reader.readLine();
        }
    }
}
