package event_implementation;

import event_implementation.engine.Engine;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher("Initial");
        Handler handler = new Handler();
        dispatcher.addNameChangeListener(handler);


        Engine engine = new Engine(dispatcher);
        engine.run();
    }
}
