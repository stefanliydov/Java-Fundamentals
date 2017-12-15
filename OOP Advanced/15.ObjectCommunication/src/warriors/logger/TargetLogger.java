package warriors.logger;

public class TargetLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {
        if(type == LogType.TARGET){
            System.out.println(type.name()+": " + message);
        }else{
            super.passToSuccessor(type, message);
        }
    }
}
