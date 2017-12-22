package hell.handlers;

import java.util.List;

public interface CommandHandler {
    String executeCOmmand(String command, List<String> params);
}
