package hell;

import hell.engine.Engine;
import hell.entities.miscellaneous.HeroInventory;
import hell.handlers.CommandHandler;
import hell.handlers.CommandHandlerImpl;
import hell.interfaces.InputReader;
import hell.interfaces.Inventory;
import hell.interfaces.OutputWriter;
import hell.io.ConsoleInputReader;
import hell.io.ConsoleOutputWriter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();

        Inventory inventory = new HeroInventory();
        CommandHandler handler = new CommandHandlerImpl(inventory);

        Engine engine = new Engine(reader, writer,handler);
        engine.run();
    }
}