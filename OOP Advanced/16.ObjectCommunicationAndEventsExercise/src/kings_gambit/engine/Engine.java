package kings_gambit.engine;

import kings_gambit.handler.Handler;
import kings_gambit.manager.Manager;
import kings_gambit.models.*;

import java.util.*;

public class Engine {

    private Handler handler;
    private Manager manager;
    public Engine(Handler handler) {
        this.handler = handler;
        manager = new Manager(this.handler);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String kingName = scanner.nextLine();
        ReportableUnit king = new King(kingName);
        HashMap<String,ReportableUnit> royalGuards = new LinkedHashMap<>();
        HashMap<String,ReportableUnit> footmen = new LinkedHashMap<>();
        Arrays.asList(scanner.nextLine().split(" ")).forEach(line -> royalGuards.put(line, new RoyalGuard(line)));
        Arrays.asList(scanner.nextLine().split(" ")).forEach(line -> footmen.put(line, new Footman(line)));

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }
            manager.execute(line, king, royalGuards, footmen);
        }
    }
}
