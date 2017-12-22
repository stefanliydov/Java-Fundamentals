package app;

import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.DefaultStrategyHolder;
import app.waste_disposal.annotations.Burnable;
import app.waste_disposal.annotations.Recyclable;
import app.waste_disposal.annotations.Storable;
import app.waste_disposal.contracts.*;
import app.waste_disposal.io.ConsoleReaderImpl;
import app.waste_disposal.io.ConsoleWriterImpl;
import app.waste_disposal.waste.BaseWaste;
import app.waste_disposal.waste.BurnableGarbage;
import app.waste_disposal.waste.RecyclableGarbage;
import app.waste_disposal.waste.StorableGarbage;
import app.waste_disposal.waste_strategies.BurnableStrategy;
import app.waste_disposal.waste_strategies.RecyclableStrategy;
import app.waste_disposal.waste_strategies.StorableStrategy;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReaderImpl();
        ConsoleWriter writer = new ConsoleWriterImpl();
        DecimalFormat df = new DecimalFormat("0.00");
        StrategyHolder strategyHolder = new DefaultStrategyHolder();
        GarbageProcessor garbageProcessor = new DefaultGarbageProcessor(strategyHolder);

        garbageProcessor.getStrategyHolder().addStrategy(Burnable.class, new BurnableStrategy());
        garbageProcessor.getStrategyHolder().addStrategy(Recyclable.class, new RecyclableStrategy());
        garbageProcessor.getStrategyHolder().addStrategy(Storable.class, new StorableStrategy());
        double totalEnergy = 0.0;
        double totalCapital = 0.0;

        while (true) {
            String[] line = reader.readLine().split("[| ]");

            if (line[0].equals("TimeToRecycle")) {
                break;
            }

            switch (line[0]) {

                case "ProcessGarbage":
                    String name = line[1];
                    double weigth = Double.parseDouble(line[2]);
                    double volumePerKg = Double.parseDouble(line[3]);

                    Waste garbage = null;
                    switch (line[4]) {
                        case "Recyclable":
                            garbage = new RecyclableGarbage(name, volumePerKg, weigth);
                            break;
                        case "Burnable":
                            garbage = new BurnableGarbage(name, volumePerKg, weigth);
                            break;
                        case "Storable":
                            garbage = new StorableGarbage(name, volumePerKg, weigth);
                            break;
                    }
                    ProcessingData data = garbageProcessor.processWaste(garbage);
                    totalEnergy+=data.getEnergyBalance();
                    totalCapital+= data.getCapitalBalance();
                    writer.writeLine(String.format("%s kg of %s successfully processed!", df.format(weigth), name));
                    break;
                case "Status":
                    writer.writeLine(String.format("Energy: %s Capital: %s",df.format(totalEnergy),df.format(totalCapital)));
                    break;
            }

        }

    }
}
