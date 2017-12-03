package warning_levels;

public class Message {

    private Importance level;
    private String content;

    public Message(Importance level, String content) {
        this.level = level;
        this.content = content;
    }
    public Importance getLevel(){
        return level;
    }

    @Override
    public String toString() {
        return this.level +": "+ this.content;
    }
}
