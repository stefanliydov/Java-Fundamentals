package kings_gambit.models;

import kings_gambit.handler.Handler;

public class Footman implements Guard,ReportableUnit{
    private String name;

    public Footman(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Footman %s is panicking!",this.name);
    }
}
