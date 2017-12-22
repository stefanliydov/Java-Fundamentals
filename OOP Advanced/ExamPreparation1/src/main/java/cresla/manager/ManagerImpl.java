package cresla.manager;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.*;
import cresla.models.modules.CooldownSystem;
import cresla.models.modules.CryogenRod;
import cresla.models.modules.HeatProcessor;
import cresla.models.reactors.CryoReactor;
import cresla.models.reactors.HeatReactor;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ManagerImpl implements Manager {

    private Map<Integer, Reactor> reactorMap;
    private Map<Integer,Module> moduleMap;
    private int id;
    private int energyModulsCounter;
    private int absorbingModulsCounter;
    private int cryoReactorCounter;
    private int heatReactorCounter;


    public ManagerImpl() {
        this.reactorMap = new HashMap<>();
        this.moduleMap = new HashMap<>();
        this.id = 1;
        this.energyModulsCounter = 0;
        this.absorbingModulsCounter = 0;
        this.cryoReactorCounter = 0;
        this.heatReactorCounter = 0;
    }

    @Override
    public String reactorCommand(List<String> arguments) {
        Container container = new ModuleContainer(Integer.valueOf(arguments.get(2)));
        if (arguments.get(0).equals("Cryo")) {
            this.reactorMap.put(id, new CryoReactor(container, this.id, Integer.valueOf(arguments.get(1))));
            this.cryoReactorCounter++;
        } else {
            this.reactorMap.put(id, new HeatReactor(container, this.id, Integer.valueOf(arguments.get(1))));
            this.heatReactorCounter++;
        }
        return String.format("Created %s Reactor - %s", arguments.get(0), this.id++);
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        int reactorId = Integer.valueOf(arguments.get(0));
        switch (arguments.get(1)) {
            case "CryogenRod":
                EnergyModule module = new CryogenRod(this.id, Integer.valueOf(arguments.get(2)));
                this.reactorMap.get(reactorId).addEnergyModule(module);
                this.energyModulsCounter++;
                this.moduleMap.put(this.id,module);
                break;
            case "HeatProcessor":
                AbsorbingModule module1 = new HeatProcessor(this.id, Integer.valueOf(arguments.get(2)));
                this.reactorMap.get(reactorId).addAbsorbingModule(module1);
                this.absorbingModulsCounter++;
                this.moduleMap.put(this.id,module1);
                break;
            case "CooldownSystem":
                AbsorbingModule module2 = new CooldownSystem(this.id, Integer.valueOf(arguments.get(2)));
                this.reactorMap.get(reactorId).addAbsorbingModule(module2);
                this.absorbingModulsCounter++;
                this.moduleMap.put(this.id,module2);
                break;
            default:
                break;
        }
        return  String.format("Added %s - %s to Reactor - %s",arguments.get(1),this.id++,reactorId);
    }

    @Override
    public String reportCommand(List<String> arguments) {
        int targetId = Integer.valueOf(arguments.get(0));
        if(reactorMap.containsKey(targetId)){
            return reactorMap.get(targetId).toString();
        }else{
            return moduleMap.get(targetId).toString();
        }

    }

    @Override
    public String exitCommand(List<String> arguments) {
        long resultEnergy = this.reactorMap.entrySet().stream().mapToLong(r -> r.getValue().getTotalEnergyOutput()).sum();
        long resultHeat = this.reactorMap.entrySet().stream().mapToLong(r -> r.getValue().getTotalHeatAbsorbing()).sum();

        return "Cryo Reactors: "+this.cryoReactorCounter+"\n" +
                "Heat Reactors: "+this.heatReactorCounter+"\n" +
                "Energy Modules: "+this.energyModulsCounter+"\n" +
                "Absorbing Modules: "+this.absorbingModulsCounter+"\n" +
                "Total Energy Output: "+resultEnergy+"\n" +
                "Total Heat Absorbing: "+resultHeat;
    }
}
