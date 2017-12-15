package warriors.logger;

public class ErrorLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ERROR) {
            System.out.println(type.name() + ": " + message);
        } else {
            super.passToSuccessor(type, message);
        }
    }
}
