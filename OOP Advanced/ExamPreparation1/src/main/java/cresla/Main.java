package cresla;

import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;
import cresla.io.Reader;
import cresla.io.Writer;
import cresla.manager.ManagerImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager= new ManagerImpl();
        OutputWriter writer = new Writer();
        InputReader reader = new Reader();

        whileLoop:
        while(true){
            List<String> line = Arrays.asList(reader.readLine().split(" "));

            switch (line.get(0)){
                case "Reactor":
                    writer.writeLine(manager.reactorCommand(line.subList(1,line.size())));
                    break;
                case "Module":
                    writer.writeLine(manager.moduleCommand(line.subList(1,line.size())));
                    break;
                case "Report":
                    writer.writeLine(manager.reportCommand(line.subList(1,line.size())));
                    break;
               default:
                   writer.writeLine(manager.exitCommand(line));
                    break whileLoop;
            }

        }
    }
}
