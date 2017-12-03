package warning_levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private Importance threshold;
    private List<Message> messages;

    public Logger(Importance threshold) {
        this.threshold = threshold;
        this.messages = new ArrayList<>();
    }
    public void record(Message message){
        if(message.getLevel().compareTo(threshold) >=0){
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return this.messages;
    }

}
