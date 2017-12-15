package Logger;

public abstract class Logger {
    private Appender consoleAppender;

    public Logger(Appender consoleAppender) {
        this.consoleAppender = consoleAppender;
    }

    public void logError(String s, String s1){
        consoleAppender.activate(s,s1);
    }
}
