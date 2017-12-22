package hell.handlers;

import hell.interfaces.Inventory;

import java.util.LinkedList;
import java.util.List;

public class CommandHandlerImpl implements CommandHandler {

    private List<String> params;
    private Inventory inventory;

    public CommandHandlerImpl( Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String executeCOmmand(String command, List<String> params) {
        this.params=params;
        return null;
    }
}
