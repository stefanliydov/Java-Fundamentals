package event_implementation.engine;

import event_implementation.Dispatcher;

import java.util.Scanner;

public class Engine {

    private Dispatcher dispatcher;
    private static final String TERMINATE_COMMAND = "End";

    public Engine(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals(TERMINATE_COMMAND)){
                break;
            }

            this.dispatcher.changeName(line);
        }
    }
}
