package kings_gambit.manager;

import kings_gambit.handler.Handler;
import kings_gambit.models.Guard;
import kings_gambit.models.King;
import kings_gambit.models.ReportableUnit;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Manager {

    private Handler handler;

    public Manager(Handler handler) {
        this.handler = handler;
    }

    public void execute(String command, ReportableUnit king, HashMap<String, ReportableUnit> royalGuards, HashMap<String, ReportableUnit> footmen) {


        String[] line = command.split(" ");

        switch (line[0]) {
            case "Attack":
               handler.report(king);
               royalGuards.values().stream().forEach(e -> handler.report(e));
               footmen.values().stream().forEach(e -> handler.report(e));
                break;
            case "Kill":
                if (royalGuards.containsKey(line[1])) {
                    royalGuards.remove(line[1]);
                } else if (footmen.containsKey(line[1])) {
                    footmen.remove(line[1]);
                }
                break;
        }

    }

}
