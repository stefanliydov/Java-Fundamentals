package kings_gambit;


import kings_gambit.engine.Engine;
import kings_gambit.handler.Handler;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(new Handler());
        engine.run();
    }
}
