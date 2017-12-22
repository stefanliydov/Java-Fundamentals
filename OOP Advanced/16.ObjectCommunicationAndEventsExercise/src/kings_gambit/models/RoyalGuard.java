package kings_gambit.models;

import kings_gambit.handler.Handler;

public class RoyalGuard implements Guard,ReportableUnit {
    private String name;

    public RoyalGuard(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Royal Guard %s is defending!",this.name);
    }
}
