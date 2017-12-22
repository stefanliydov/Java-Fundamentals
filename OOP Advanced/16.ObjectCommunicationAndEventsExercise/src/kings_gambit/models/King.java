package kings_gambit.models;

import kings_gambit.handler.Handler;

public class King implements ReportableUnit {
    private String name;

    public King(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return String.format("King %s is under attack!",this.name);
    }
}
